SUMMARY = "Header files for openmopac"
DESCRIPTION = "MOPAC is a computational chemistry software package that implements a \
variety of semi-empirical quantum chemistry methods based on the neglect of \
diatomic differential overlap (NDDO) approximation and fit primarily for \
gas-phase thermochemistry \
 \
This package contains development files."
LICENSE = "Apache-2.0"

PV = "23.2.5"

RPM_NAME = "mopac-devel-23.2.5-1.3.aarch64.rpm"
RPM_HASH = "5035a8f7ffa5f4099e874dd5285b72a321b8f8dd6af425b09fb9ca47193b6e37fce4ee59a59da4949179ae63901e5f476372638dda9bd1c4469a762022bab96b"

RPROVIDES:${PN} += "libmopac7-1-devel \
mopac-devel"

RDEPENDS:${PN} += "libmopac2"

inherit rpm
