SUMMARY = "Test programs for ScaLAPACK (openmpi4)"
DESCRIPTION = "This packages contains some test programs for ScaLAPACK compiled against \
openmpi4."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2.2.2"

RPM_NAME = "scalapack-openmpi4-test-2.2.2-1.3.aarch64.rpm"
RPM_HASH = "0c0c3c64270631d3fb77a02b1fb9745e7456255b32646476711f224e8130e7cdf83352e3c980aeb8486a48f8811c54721e079eb2d41843d1f9e686a6dabe3cac"

RPROVIDES:${PN} += "scalapack-openmpi4-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
liblapack.so.3 \
libm.so.6 \
libmpi-mpifh.so.40 \
libmpi.so.40"

inherit rpm
