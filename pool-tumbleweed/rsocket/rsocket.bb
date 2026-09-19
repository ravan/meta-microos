SUMMARY = "Preloadable library to turn the socket API RDMA-aware"
DESCRIPTION = "Existing applications can make use of rsockets through the use this \
preloadable library. See the documentation in the packaged rsocket(7) \
manpage for details."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "rsocket-63.0-1.3.aarch64.rpm"
RPM_HASH = "4f1c2e81471aa64d14d19211f3a43b889c6a4d54534fa0fa9b436139b22d4eb31095d4a4c3d867ae6e095c298ce878c07f85646f3e30aa715c6ce7f93e57b932"

RPROVIDES:${PN} += "librspreload.so \
rsocket"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librdmacm.so.1"

inherit rpm
