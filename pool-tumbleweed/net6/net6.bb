SUMMARY = "Network access framework for IPv4/IPv6"
DESCRIPTION = "net6 is a library which eases the development of network-based \
applications as it provides a TCP protocol abstraction for C++. It is \
portable to both the Windows and Unix-like platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.14"

RPM_NAME = "net6-1.3.14-13.9.aarch64.rpm"
RPM_HASH = "490de68c511701915df205ebd0c9e09fe91ea78b931d0dd99406bbb952c06da08a5842e84584c41f1dde07bdaba35a761290794d09a377a42603bd4d54d50326"

RPROVIDES:${PN} += "libnet6-1.3.so.0 \
net6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
net6-lang"

inherit rpm
