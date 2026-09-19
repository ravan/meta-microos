SUMMARY = "Headers and development files"
DESCRIPTION = "genders headers and libraries files needed for development"
LICENSE = "GPL-2.0-or-later"

PV = "1.32"

RPM_NAME = "genders-devel-1.32-1.10.aarch64.rpm"
RPM_HASH = "c6b635ad9492c1257b74fc2887835ed4ba75b8459389e0657b471764d98d2dee6f71c01cdbb11bd439626d861dd3843a0a4072ab5045020f997e6d17dac9c61c"

RPROVIDES:${PN} += "genders-devel"

RDEPENDS:${PN} += "genders"

inherit rpm
