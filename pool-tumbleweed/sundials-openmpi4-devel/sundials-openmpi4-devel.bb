SUMMARY = "Suite of nonlinear solvers (developer files)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the developer files (.so file, header files)"
LICENSE = "BSD-3-Clause"

PV = "7.9.0"

RPM_NAME = "sundials-openmpi4-devel-7.9.0-1.1.aarch64.rpm"
RPM_HASH = "7d5701d9f08cb12c250ccac02582ba80e85a41d903d831347551a146783743ab75c03b20b9426e478cd869c8a22ae9939e173b9125adc72382080f1d2632b995"

RPROVIDES:${PN} += "sundials-openmpi4-devel"

RDEPENDS:${PN} += "libsundials-arkode6-openmpi4 \
libsundials-core7-openmpi4 \
libsundials-cvode7-openmpi4 \
libsundials-cvodes7-openmpi4 \
libsundials-ida7-openmpi4 \
libsundials-idas6-openmpi4 \
libsundials-kinsol7-openmpi4 \
libsundials-nvec7-openmpi4 \
libsundials-sundomeigestarnoldi1-openmpi4 \
libsundials-sundomeigestpower1-openmpi4 \
libsundials-sunlinsol5-openmpi4 \
libsundials-sunmatrix5-openmpi4 \
libsundials-sunnonlin4-openmpi4"

inherit rpm
