//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: /Users/ex3ndr/Develop/actor-platform/actor-apps/core/src/main/java/im/actor/model/network/ActorApi.java
//

#ifndef _AMActorApi_H_
#define _AMActorApi_H_

#include "J2ObjC_header.h"

@class AMEndpoints;
@class AMNetworkStateEnum;
@class APRequest;
@protocol AMActorApiCallback;
@protocol AMAuthKeyStorage;
@protocol AMNetworkProvider;
@protocol AMRpcCallback;

#define AMActorApi_MTPROTO_VERSION 1
#define AMActorApi_API_MAJOR_VERSION 1
#define AMActorApi_API_MINOR_VERSION 6

@interface AMActorApi : NSObject

#pragma mark Public

- (instancetype)initWithAMEndpoints:(AMEndpoints *)endpoints
               withAMAuthKeyStorage:(id<AMAuthKeyStorage>)keyStorage
             withAMActorApiCallback:(id<AMActorApiCallback>)callback
              withAMNetworkProvider:(id<AMNetworkProvider>)networkProvider
                        withBoolean:(jboolean)isEnableLog
                            withInt:(jint)minDelay
                            withInt:(jint)maxDelay
                            withInt:(jint)maxFailureCount;

- (void)forceNetworkCheck;

- (void)onNetworkChangedWithAMNetworkStateEnum:(AMNetworkStateEnum *)state;

- (void)requestWithAPRequest:(APRequest *)request
           withAMRpcCallback:(id<AMRpcCallback>)callback;

@end

J2OBJC_STATIC_INIT(AMActorApi)

J2OBJC_STATIC_FIELD_GETTER(AMActorApi, MTPROTO_VERSION, jint)

J2OBJC_STATIC_FIELD_GETTER(AMActorApi, API_MAJOR_VERSION, jint)

J2OBJC_STATIC_FIELD_GETTER(AMActorApi, API_MINOR_VERSION, jint)

FOUNDATION_EXPORT void AMActorApi_initWithAMEndpoints_withAMAuthKeyStorage_withAMActorApiCallback_withAMNetworkProvider_withBoolean_withInt_withInt_withInt_(AMActorApi *self, AMEndpoints *endpoints, id<AMAuthKeyStorage> keyStorage, id<AMActorApiCallback> callback, id<AMNetworkProvider> networkProvider, jboolean isEnableLog, jint minDelay, jint maxDelay, jint maxFailureCount);

FOUNDATION_EXPORT AMActorApi *new_AMActorApi_initWithAMEndpoints_withAMAuthKeyStorage_withAMActorApiCallback_withAMNetworkProvider_withBoolean_withInt_withInt_withInt_(AMEndpoints *endpoints, id<AMAuthKeyStorage> keyStorage, id<AMActorApiCallback> callback, id<AMNetworkProvider> networkProvider, jboolean isEnableLog, jint minDelay, jint maxDelay, jint maxFailureCount) NS_RETURNS_RETAINED;

J2OBJC_TYPE_LITERAL_HEADER(AMActorApi)

typedef AMActorApi ImActorModelNetworkActorApi;

#endif // _AMActorApi_H_
