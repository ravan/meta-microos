SUMMARY = "Faust Android build support"
DESCRIPTION = "Faust Android build support."
LICENSE = "GPL-2.0-only"

PV = "2.88.0"

RPM_NAME = "faust-android-devel-2.88.0-1.1.noarch.rpm"
RPM_HASH = "edd62d0f2075d22f53d81eabc8d3e3835885a3b61e728d101f452ab74b167b0e9ef1f56fc1deed1f420faf099c9a9846c53ae35c71de895f48a1802af0232aa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "faust-android-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
faust \
faust-devel"

inherit rpm
