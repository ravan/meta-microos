SUMMARY = "Header files for libSavitar"
DESCRIPTION = "Development package for libSavitar."
LICENSE = "LGPL-3.0-only"

PV = "4.13.1"

RPM_NAME = "libSavitar-devel-4.13.1-3.5.aarch64.rpm"
RPM_HASH = "172a0426c4382c54a6331f5ff66a54f31fb232fdcde7b178943bd4224f771c576603fa8f25b35c51f9af8519840f7de3be18119fade34777e00f574d76717e06"

RPROVIDES:${PN} += "cmake-Savitar \
libSavitar-devel"

RDEPENDS:${PN} += "libSavitar0 \
python3-sip-devel"

inherit rpm
