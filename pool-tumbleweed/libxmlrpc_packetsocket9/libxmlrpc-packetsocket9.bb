SUMMARY = "xmlrpc-c packet socket emulation on stream sockets"
DESCRIPTION = "This xmlrpc-c component library contains a facility for communicating \
socket-style, with defined packets like a datagram socket but with \
reliable delivery like a stream socket. It's like a POSIX 'sequential \
packet' socket, except it is built on top of a stream socket, so it \
is usable on the many systems that have stream sockets but not \
sequential packet sockets."
LICENSE = "BSD-3-Clause & MIT"

PV = "1.64.03"

RPM_NAME = "libxmlrpc_packetsocket9-1.64.03-2.1.aarch64.rpm"
RPM_HASH = "1a568e145f509b1a8bf16bb8b5fb802722107846d5f36087f3f44d5ba40cdea92199ed0236ba9cb45c593684d45925d561d0d7635ea565b40f2f16ce72dbace8"

RPROVIDES:${PN} += "libxmlrpc-packetsocket.so.9 \
libxmlrpc-packetsocket9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxmlrpc-util++.so.9"

inherit rpm
