SUMMARY = "Package provides recommended R-boot"
DESCRIPTION = "This packages provides R-boot, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.3.32"

RPM_NAME = "R-boot-1.3.32-58.3.aarch64.rpm"
RPM_HASH = "777b2ef9c61cd1328683752951774f61ae18a7757ce75398687f4858e0e4a53769cb55b015d9e5a8fe26d8a99792131a1a59af35578bf80eaf7003c3313e83b7"

RPROVIDES:${PN} += "R-boot"

RDEPENDS:${PN} += "R-base"

inherit rpm
