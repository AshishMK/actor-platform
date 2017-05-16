package br.com.diegosilva.lotericas.core.api.rpc;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import java.io.IOException;

import br.com.diegosilva.lotericas.core.api.*;

import static im.actor.runtime.bser.Utils.*;

public class RequestCreateGroupPre extends Request<ResponseCreateGroupPre> {

    public static final int HEADER = 0x13;

    public static RequestCreateGroupPre fromBytes(byte[] data) throws IOException {
        return Bser.parse(new RequestCreateGroupPre(), data);
    }

    private long groupId;
    private long groupFatherId;

    public RequestCreateGroupPre(long groupId, long groupFatherId) {
        this.groupId = groupId;
        this.groupFatherId = groupFatherId;
    }

    public RequestCreateGroupPre() {

    }

    public long getGroupId() {
        return this.groupId;
    }

    public long getGroupFatherId() {
        return this.groupFatherId;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.groupId = values.getLong(1);
        this.groupFatherId = values.getLong(2);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeLong(1, this.groupId);
        writer.writeLong(2, this.groupFatherId);
    }

    @Override
    public String toString() {
        String res = "rpc CreateGroupPre{";
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}