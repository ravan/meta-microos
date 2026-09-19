SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "sundials-devel-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "5e790ddec3bb3f6c377f24b8a072b85623d39b8d1c90d98fe4bb76e3735dd72a831ff426dc1baae2a2005816c7811f696b82f22e9804493dc26ab71a6a050574"

RPROVIDES:${PN} += "cmake-SUNDIALS \
sundials-devel"

RDEPENDS:${PN} += "libsundials-arkode6 \
libsundials-core7 \
libsundials-cvode7 \
libsundials-cvodes7 \
libsundials-ida7 \
libsundials-idas6 \
libsundials-kinsol7 \
libsundials-nvec7 \
libsundials-sundomeigestarnoldi1 \
libsundials-sundomeigestpower1 \
libsundials-sunlinsol5 \
libsundials-sunmatrix5 \
libsundials-sunnonlin4"

inherit rpm
