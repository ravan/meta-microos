SUMMARY = "LSC Algorithm Simulation Library"
DESCRIPTION = "The LSC Algorithm Simulation Library for gravitational wave data analysis. This \
package contains the shared-object libraries needed to run applications \
that use the LAL Simulation library."
LICENSE = "GPL-2.0-only"

PV = "6.2.0"

RPM_NAME = "python314-lalsimulation-6.2.0-2.2.aarch64.rpm"
RPM_HASH = "8429dc134e8a29308a4cb77430350a452c47cf42ac21b26a02d91555dc5af7b09156256cfbe9a5442e201db4c86641c5bb4c283fd86b9c08c74eb31a4d2ba2be"

RPROVIDES:${PN} += "python314-lalsimulation"

RDEPENDS:${PN} += "lalsimulation-data \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgsl.so.28 \
liblal.so.20 \
liblalsupport.so.14 \
libm.so.6 \
python-abi \
python314-lal \
python314-numpy"

inherit rpm
