SUMMARY = "A library for run-time tuning of process binding policies"
DESCRIPTION = "QUO is an API tailored for MPI/MPI+X codes that may benefit from \
evolving process binding policies during their execution. QUO allows \
for arbitrary process binding policies to be enacted and reverted \
during the execution as different computational phases are entered \
and exited, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.4.1"

RPM_NAME = "libquo8-1.4.1-1.1.aarch64.rpm"
RPM_HASH = "eb1f83725e6e47f537eb2d6fdd1b470217847ad7497e63e6b158b84979d389ef2c4406f32634eb14a30f8b04dc1c06251749cd3407078aa0c477e56d8d32dfab"

RPROVIDES:${PN} += "libquo.so.8 \
libquo8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmpi.so.40"

inherit rpm
