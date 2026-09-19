SUMMARY = "Crypto library for aws-lc"
DESCRIPTION = "Crypto library for aws-lc."
LICENSE = "Apache-2.0"

PV = "5.5.0"

RPM_NAME = "libcrypto-awslc1-5.5.0-1.2.aarch64.rpm"
RPM_HASH = "0c8fa7a1c828ae656637f8135a8b95c524cedc5c6c0d3b50d9fa0cabd9bd94fe914afb08d65975e6676d33909a0e8d83178a2ecd3b14a32ed6816bf04be2f46c"

RPROVIDES:${PN} += "libcrypto-awslc.so.1 \
libcrypto-awslc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
