SUMMARY = "Static libraries for ScaLAPACK (openmpi4)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against openmpi4."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libscalapack2-openmpi4-devel-static-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "f0456b53597f646ea2a2399217b4bbec9bd07f66db390e9c4da57e503f04fac2e1164b7f4c07541fb6f09b44cf35ec9f0f87ee409ad1cbe07a615e335ae8943a"

RPROVIDES:${PN} += "libscalapack2-openmpi4-devel-static \
scalapack-openmpi4-devel-static"

RDEPENDS:${PN} += "libscalapack2-openmpi4-devel"

inherit rpm
