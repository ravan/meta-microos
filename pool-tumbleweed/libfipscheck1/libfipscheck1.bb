SUMMARY = "Library files for fipscheck"
DESCRIPTION = "This package contains the FIPSCheck library."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "libfipscheck1-1.7.0-2.12.aarch64.rpm"
RPM_HASH = "6cdeb5ef3c989cd8cbb510c2971d55e237e82f97c2f09004aa4f3348124d45bce70ec2053b358d309257a0d14f334d2de72d3156d9533413288865e5ef262235"

RPROVIDES:${PN} += "libfipscheck.so.1 \
libfipscheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/fipscheck \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
