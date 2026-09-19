SUMMARY = "Non-ABI stable API for the Qt 6 3DInput library"
DESCRIPTION = "This package provides private headers of libQt63DInput that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-3dinput-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "84378e81b6f54d64ca5de39fe7917d78aecfe91ddd6f7492e44e8ac230db30cdc6c5e0210253c9f62f6b882239e7d09fff8d91d056aa63d2e73adbe4bd6fedd1"

RPROVIDES:${PN} += "cmake-Qt63DInputPrivate \
qt6-3dinput-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DCorePrivate \
cmake-Qt63DInput \
cmake-Qt6CorePrivate"

inherit rpm
