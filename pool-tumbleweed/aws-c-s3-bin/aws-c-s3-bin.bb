SUMMARY = "Binary files for aws-c-s3 library"
DESCRIPTION = "AWS Crypto Abstraction Layer: Cross-Platform, C99 wrapper for cryptography primitives. \
 \
This package contains the command line utilities."
LICENSE = "Apache-2.0"

PV = "0.13.7"

RPM_NAME = "aws-c-s3-bin-0.13.7-1.1.aarch64.rpm"
RPM_HASH = "9ce79223c3f7bd454aa2d2ae782a53fcbe1caa2dcdaa1d76326498a0893e872fa1f74fa70f77d3552eea2f5ee0783824207142702672c662d173a6d040f1fbae"

RPROVIDES:${PN} += "aws-c-s3-bin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaws-c-auth.so.1.0.0 \
libaws-c-common.so.1 \
libaws-c-http.so.1.0.0 \
libaws-c-io.so.0unstable \
libaws-c-s3.so.0unstable \
libc.so.6"

inherit rpm
