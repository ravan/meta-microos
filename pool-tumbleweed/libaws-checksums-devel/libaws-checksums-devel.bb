SUMMARY = "Development files for aws-checksums library"
DESCRIPTION = "Core c99 package for AWS SDK for C. Includes cross-platform primitives, \
configuration, data structures, and error handling. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "libaws-checksums-devel-0.2.11-1.1.aarch64.rpm"
RPM_HASH = "26543626a53cf32916865790ac8f45ded3025463d0b954136ca3a33a1aaeae844369aeab55547c81c65fe201db3b236de6aacca1132aaf78b62d55d8e4d1f1ce"

RPROVIDES:${PN} += "cmake-aws-checksums \
libaws-checksums-devel"

RDEPENDS:${PN} += "libaws-checksums1"

inherit rpm
