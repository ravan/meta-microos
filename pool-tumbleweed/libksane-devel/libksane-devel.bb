SUMMARY = "Development files for the KDE scanning library"
DESCRIPTION = "This package contains a library to add scan support to KDE applications."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libksane-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "69e94505a01ffc941464403397dd34daf40b7963a5cc43ac6ae9900063357fd6152518a8d38a5e6c9889b4748b29d4940671db99f0aeff70faf0ea0eca92a9cb"

RPROVIDES:${PN} += "cmake-KSaneWidgets6 \
libksane-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
libKSaneWidgets6"

inherit rpm
