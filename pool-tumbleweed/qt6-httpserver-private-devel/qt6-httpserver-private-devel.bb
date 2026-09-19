SUMMARY = "Non-ABI stable API for the Qt 6 HttpServer Library"
DESCRIPTION = "This package provides private headers of libQt6HttpServer that do not have any \
ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-httpserver-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "28c8d873edf82a8bd194685b31d577eda9bbe7f4c000207c653250ed5dcc77e21ab0421cbea534874a06aeac1912de7835f0f71dcfb8a56058262ad3d885dde7"

RPROVIDES:${PN} += "cmake-Qt6HttpServerPrivate \
qt6-httpserver-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6HttpServer \
cmake-Qt6NetworkPrivate \
cmake-Qt6WebSocketsPrivate"

inherit rpm
