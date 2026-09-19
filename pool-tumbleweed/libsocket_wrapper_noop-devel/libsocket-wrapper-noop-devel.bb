SUMMARY = "Development headers for libsocket_wrapper_noop"
DESCRIPTION = "Development headers for applications with the need to call \
socket_wrapper_enabled()."
LICENSE = "BSD-3-Clause"

PV = "1.5.2"

RPM_NAME = "libsocket_wrapper_noop-devel-1.5.2-1.5.aarch64.rpm"
RPM_HASH = "b032f04a3180e41ca6c53937777fa43c84c7e941f3f3bfd1de76a161dce4e38d722361e0ae2269680098cbc0fe5fb16c09c6a2d523062e5104803dd2117bc23b"

RPROVIDES:${PN} += "cmake-socket-wrapper \
cmake-socket-wrapper-noop \
libsocket-wrapper-noop-devel \
pkgconfig-socket-wrapper-noop"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocket-wrapper-noop0"

inherit rpm
