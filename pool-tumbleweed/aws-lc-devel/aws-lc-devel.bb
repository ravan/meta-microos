SUMMARY = "AWS-LC development headers"
DESCRIPTION = "AWS-LC is a general-purpose cryptographic library maintained by the AWS \
Cryptography team for AWS and their customers. It іs based on code from the \
Google BoringSSL project and the OpenSSL project."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "aws-lc-devel-5.5.0-1.2.aarch64.rpm"
RPM_HASH = "a7c8b713cb9b16602fafe1f9fbf46f3e32ef22ead249906c199dee2164e50b9857c460d656f7166df1fc3d5fcd0c6f0919396d65248cec51c59064c4602198ff"

RPROVIDES:${PN} += "aws-lc-devel \
pkgconfig-aws-lc \
pkgconfig-libcrypto-awslc \
pkgconfig-libssl-awslc \
pkgconfig-openssl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcrypto-awslc1 \
libssl-awslc1 \
pkgconfig-libcrypto-awslc \
pkgconfig-libssl-awslc"

inherit rpm
