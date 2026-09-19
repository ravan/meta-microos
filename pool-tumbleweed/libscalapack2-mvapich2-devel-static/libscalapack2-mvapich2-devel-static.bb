SUMMARY = "Static libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "libscalapack2-mvapich2-devel-static-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "a9ad2cfc777d4d5704076c9625dd6177930499af86187a5533ad6d06adc7aa9f4db852b8db2e23d78c689b636c05e9f39a4b01412f8b90254431b7dc4d664073"

RPROVIDES:${PN} += "libscalapack2-mvapich2-devel-static \
scalapack-mvapich2-devel-static"

RDEPENDS:${PN} += "libscalapack2-mvapich2-devel"

inherit rpm
