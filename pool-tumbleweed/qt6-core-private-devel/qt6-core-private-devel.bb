SUMMARY = "Non-ABI stable API for the Qt 6 Core library"
DESCRIPTION = "This package provides private headers of libQt6Core that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-core-private-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "97e9bc0520e6326b5ea502cc82bd7f0560b240f0aa7aacb59c57c93d1a034b5380648a99bfb48187826edb01c016f2710a8ddd820f9adbcc83c701495b0c6f41"

RPROVIDES:${PN} += "cmake-Qt6CorePrivate \
qt6-core-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Core"

inherit rpm
