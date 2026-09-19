SUMMARY = "Files for developing with Nuspell"
DESCRIPTION = "Header files and definitions for developing with Nuspell."
LICENSE = "LGPL-3.0-or-later"

PV = "5.1.7"

RPM_NAME = "nuspell-devel-5.1.7-1.4.aarch64.rpm"
RPM_HASH = "c1ee66e11bf6213b131ae973b45f164be51cf1df8545b2c20316a874af6434645f77d488f8e08cd84e37694f424437522a0243a29f921c156ad2011481d24738"

RPROVIDES:${PN} += "cmake-Nuspell \
nuspell-devel \
pkgconfig-nuspell"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnuspell5 \
pkgconfig-icu-uc"

inherit rpm
