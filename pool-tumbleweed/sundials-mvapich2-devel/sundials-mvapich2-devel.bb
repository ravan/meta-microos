SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "sundials-mvapich2-devel-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "0550628e749f4e840f922811b74a22b7718d23b99b7558350b1fae2ab0c98b0aaec9d49de14261be57d14ba0b9687d13cc7d0302678a584dac7be1c1808d9d57"

RPROVIDES:${PN} += "sundials-mvapich2-devel"

RDEPENDS:${PN} += "libsundials-arkode6-mvapich2 \
libsundials-core7-mvapich2 \
libsundials-cvode7-mvapich2 \
libsundials-cvodes7-mvapich2 \
libsundials-ida7-mvapich2 \
libsundials-idas6-mvapich2 \
libsundials-kinsol7-mvapich2 \
libsundials-nvec7-mvapich2 \
libsundials-sundomeigestarnoldi1-mvapich2 \
libsundials-sundomeigestpower1-mvapich2 \
libsundials-sunlinsol5-mvapich2 \
libsundials-sunmatrix5-mvapich2 \
libsundials-sunnonlin4-mvapich2"

inherit rpm
