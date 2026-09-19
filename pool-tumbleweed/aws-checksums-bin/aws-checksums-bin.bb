SUMMARY = "Binary files for aws-checksums library"
DESCRIPTION = "Core c99 package for AWS SDK for C. Includes cross-platform primitives, \
configuration, data structures, and error handling. \
 \
This package contains the binary files."
LICENSE = "Apache-2.0"

PV = "0.2.11"

RPM_NAME = "aws-checksums-bin-0.2.11-1.1.aarch64.rpm"
RPM_HASH = "368c7a8aad35222ee22e3e09bb6f931c86a9fae6fb75e56976eda5cdeb985936b7d8a90f7f6f042193ab9547ec32275ccf73aff45b8b93a8f4540cd1ec2d7fd6"

RPROVIDES:${PN} += "aws-checksums-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-common.so.1 \
libaws-checksums.so.1 \
libaws-checksums1 \
libc.so.6"

inherit rpm
