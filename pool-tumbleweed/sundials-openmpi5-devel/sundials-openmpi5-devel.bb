SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "sundials-openmpi5-devel-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "cfda4d72dfcd2682f0fc7bbc7748afa9aebf1df4d933ab5cc8b9d087310a34d7491e6c71c73a926a260d5f6ece8f1cf6029bfae4fdc83550cd8bc0708ea294bf"

RPROVIDES:${PN} += "sundials-openmpi5-devel"

RDEPENDS:${PN} += "libsundials-arkode6-openmpi5 \
libsundials-core7-openmpi5 \
libsundials-cvode7-openmpi5 \
libsundials-cvodes7-openmpi5 \
libsundials-ida7-openmpi5 \
libsundials-idas6-openmpi5 \
libsundials-kinsol7-openmpi5 \
libsundials-nvec7-openmpi5 \
libsundials-sundomeigestarnoldi1-openmpi5 \
libsundials-sundomeigestpower1-openmpi5 \
libsundials-sunlinsol5-openmpi5 \
libsundials-sunmatrix5-openmpi5 \
libsundials-sunnonlin4-openmpi5"

inherit rpm
