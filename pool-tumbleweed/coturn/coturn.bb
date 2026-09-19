SUMMARY = "TURN and STUN server for VoIP"
DESCRIPTION = "STUN (Session Traversal Utilities for NAT) and TURN (Traversal Using Relays \
around NAT) are protocols that can be used to provide NAT traversal for VoIP \
and WebRTC. \
 \
It can be used as a general-purpose network traffic TURN server and gateway, \
too. On-line management interface (over telnet or over HTTPS) for the TURN \
server is available."
LICENSE = "BSD-3-Clause"

PV = "4.18.0"

RPM_NAME = "coturn-4.18.0-1.1.aarch64.rpm"
RPM_HASH = "fe2e0493b73669b752dc0fbf436c9bb6878345c2db5d79e6f685839102afe5ae371c9f68f99ba51895917ed46c0827af9bf002fe65981d1c1fd5febcba9c174f"

RPROVIDES:${PN} += "config-coturn \
coturn \
group-coturn \
user-coturn"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-core-2.1.so.7 \
libevent-extra-2.1.so.7 \
libevent-openssl-2.1.so.7 \
libevent-pthreads-2.1.so.7 \
libhiredis-ssl.so.1.3.0 \
libhiredis.so.1.3.0 \
libmariadb.so.3 \
libpq.so.5 \
libsqlite3.so.0 \
libssl.so.3 \
shadow \
sysuser-shadow"

inherit rpm
