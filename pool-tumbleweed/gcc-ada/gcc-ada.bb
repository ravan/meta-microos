SUMMARY = "The system GNU Ada Compiler"
DESCRIPTION = "The system GNU Ada Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "16"

RPM_NAME = "gcc-ada-16-1.1.aarch64.rpm"
RPM_HASH = "89053b68be62c3357fd4d166b822e75eeb73967960d5fe6d5d13a0ec2b7d73059340d605685e515fae5f220176fa2d7355ed8380279cab377c78512e66a5543a"

RPROVIDES:${PN} += "gcc-ada"

RDEPENDS:${PN} += "gcc \
gcc16-ada"

inherit rpm
