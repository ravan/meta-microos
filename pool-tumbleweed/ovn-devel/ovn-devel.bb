SUMMARY = "Development files for Open Virtual Network"
DESCRIPTION = "Devel libraries and headers for Open Virtual Network."
LICENSE = "Apache-2.0"

PV = "26.03.2"

RPM_NAME = "ovn-devel-26.03.2-37.1.aarch64.rpm"
RPM_HASH = "1f3548fddeb4da74abbf306ab5558d24d151b59ea808978fdfdd379d2a6f1215a392df56bfc0c21053c7190052aa79e231b5f8d4fc6a69235049ee0e288294dc"

RPROVIDES:${PN} += "openvswitch-devel-/usr/include/ovn \
ovn-devel"

RDEPENDS:${PN} += "libovn-26-03-0"

inherit rpm
