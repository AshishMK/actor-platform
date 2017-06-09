/*
 * Copyright (C) 2015 Actor LLC. <https://actor.im>
 */

package im.actor.core.entity;

import im.actor.core.api.ApiFastThumb;
import im.actor.core.api.ApiGroup;
import im.actor.core.api.ApiMessageState;
import im.actor.core.api.ApiPeer;
import im.actor.core.api.ApiPeerType;
import im.actor.core.entity.content.FastThumb;

public class EntityConverter {

    public static int convert(ApiMessageState state) {
        if (state == null) {
            return MessageState.UNKNOWN;
        }
        switch (state) {
            case READ:
            case RECEIVED:
            case SENT:
                return MessageState.SENT;
            default:
                return MessageState.UNKNOWN;
        }
    }

    public static Group convert(ApiGroup group) {
        return new Group(group, null);
    }

    public static int convert(ApiPeerType peerType) {
        switch (peerType) {
            case GROUP:
                return PeerType.GROUP;
            default:
            case PRIVATE:
                return PeerType.PRIVATE;
        }
    }

    public static Peer convert(ApiPeer peer) {
        return new Peer(convert(peer.getType()), peer.getId());
    }


    public static FastThumb convert(ApiFastThumb fastThumb) {
        if (fastThumb == null) {
            return null;
        }
        return new FastThumb(fastThumb.getW(), fastThumb.getH(), fastThumb.getThumb());
    }
}
