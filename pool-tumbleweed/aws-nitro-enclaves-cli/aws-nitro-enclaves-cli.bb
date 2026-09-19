SUMMARY = "Tools for managing enclaves"
DESCRIPTION = "A collection of tools and commands used for managing the lifecycle of \
enclaves. The Nitro CLI needs to be installed on the parent instance, \
and it can be used to start, manage, and terminate enclaves."
LICENSE = "Apache-2.0"

PV = "1.5.0~git0.2950b36"

RPM_NAME = "aws-nitro-enclaves-cli-1.5.0~git0.2950b36-1.1.aarch64.rpm"
RPM_HASH = "dbdd1cb8992e6f402a810d0a3a4f142d9e41a366cb5f8feb3eea1e5ccec9cd500097cd69684013ce746bba3d09cbc35c368ea507c097860788357101929b18f8"

RPROVIDES:${PN} += "aws-nitro-enclaves-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
aws-nitro-enclaves-binaryblobs \
coreutils \
jq \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libssl.so.3 \
system-group-ne"

inherit rpm
