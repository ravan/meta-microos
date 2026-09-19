SUMMARY = "Development files for aws-c-s3 library"
DESCRIPTION = "AWS Crypto Abstraction Layer: Cross-Platform, C99 wrapper for cryptography primitives. \
 \
This package contains the development files."
LICENSE = "Apache-2.0"

PV = "0.13.7"

RPM_NAME = "aws-c-s3-devel-0.13.7-1.1.aarch64.rpm"
RPM_HASH = "0442c32735efc3fc1a8b5619fb6ba45081d9e2420906e4e0bade8e7d74d73c35dbae285814f224a7ef103da241c6a9c5ce33c18e70f8bff631acb4ca92be12c3"

RPROVIDES:${PN} += "aws-c-s3-devel \
cmake-aws-c-s3"

RDEPENDS:${PN} += "libaws-c-s3-0unstable"

inherit rpm
