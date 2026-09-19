SUMMARY = "Test programs for ScaLAPACK (mvapich2)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
mvapich2."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "scalapack-mvapich2-test-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "b8ec646528f6093ca8ea3ad41382fcdfee2fdd74e519f3ca5e0e124ea636c887a5ff087299b9b368d40eebc9c8b691eb55cc2309fe7b07f37efba8968d077cc5"

RPROVIDES:${PN} += "scalapack-mvapich2-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.12 \
libmpifort.so.12"

inherit rpm
