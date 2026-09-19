SUMMARY = "Headers and cmake files for the igsc library"
DESCRIPTION = "Headers and cmake files for the igsc library."
LICENSE = "Apache-2.0"

PV = "1.3.1"

RPM_NAME = "igsc-devel-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "fb86fb2c2fc137f533de46f0e0f27fc5641c0b8e833d3e9754d6ad4ac9149b56c55aebec0da85a072f50406504df8bd1498e1173dfcaac69601d33e0e5ae4671"

RPROVIDES:${PN} += "cmake-igsc \
igsc-devel"

RDEPENDS:${PN} += ""

inherit rpm
