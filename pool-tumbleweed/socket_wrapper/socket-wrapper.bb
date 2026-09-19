SUMMARY = "A library passing all socket communications through Unix sockets"
DESCRIPTION = "socket_wrapper helps client/server software development to gain functional test \
coverage. It can run several instances of a software stack on the same machine \
and perform functional testing of network configurations locally. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libsocket_wrapper.so \
SOCKET_WRAPPER_DIR=/path/to/swrap_dir"
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "socket_wrapper-1.5.2-1.5.aarch64.rpm"
RPM_HASH = "eb4625a24fd89ece4ad529ad4ada3bff4df18c65eed5b19b204b5eae19bab58c61a8aef73540516bd3df8b9bede31cbe06362101f21725d9fe8a61a3e4080084"

RPROVIDES:${PN} += "cmake-socket-wrapper \
cmake-socket-wrapper-noop \
libsocket-wrapper.so.0 \
pkgconfig-socket-wrapper \
socket-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
