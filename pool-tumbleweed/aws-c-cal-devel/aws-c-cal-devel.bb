SUMMARY = "Development files for aws-c-cal library"
DESCRIPTION = "AWS Crypto Abstraction Layer, a C99 wrapper for cryptography primitives. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.9.15"

RPM_NAME = "aws-c-cal-devel-0.9.15-1.1.aarch64.rpm"
RPM_HASH = "91150905f032a570f2ea6ba6a2854b940a55ce3f6a6bfcf6c6cfe315a5ebe865aa73fb3d00427b87d62d0849f373ed85d9543e10e1253fc258f9cd98e1fa74d8"

RPROVIDES:${PN} += "aws-c-cal-devel \
cmake-aws-c-cal"

RDEPENDS:${PN} += "libaws-c-cal0unstable"

inherit rpm
