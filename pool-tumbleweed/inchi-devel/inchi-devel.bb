SUMMARY = "Development headers for the InChI library"
DESCRIPTION = "This package contains the development files for the InChI library."
LICENSE = "MIT"

PV = "1.07.5"

RPM_NAME = "inchi-devel-1.07.5-1.4.aarch64.rpm"
RPM_HASH = "9d15a5a205e92759f43a71db2d8fafb75a26f9cd999121831c567bf1093040ada9cfbef8858180fd4571957593c3d3c4106acdfd962a1be81722fedcb3ca02af"

RPROVIDES:${PN} += "inchi-devel"

RDEPENDS:${PN} += "libinchi1"

inherit rpm
