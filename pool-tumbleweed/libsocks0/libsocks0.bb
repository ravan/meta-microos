SUMMARY = "A SOCKSv4 and v5 client implementation"
DESCRIPTION = "Dante is an implementation of the following proxy protocols: SOCKS \
version 4, SOCKS version 5 (RFC 1928), and msproxy. It can be used as a \
firewall between networks. \
 \
This package contains the dynamic libraries required to make existing \
applications become socks clients."
LICENSE = "BSD-3-Clause"

PV = "1.4.4"

RPM_NAME = "libsocks0-1.4.4-2.4.aarch64.rpm"
RPM_HASH = "e030633c81d578aac21b7245b18c03e8141ea0f17341603c206de701e2adbc84ea33add3cab068e0848fe209435ff4a05229447b654f61a6163179a52759b11b"

RPROVIDES:${PN} += "libsocks.so.0 \
libsocks0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2 \
libminiupnpc.so.21"

inherit rpm
