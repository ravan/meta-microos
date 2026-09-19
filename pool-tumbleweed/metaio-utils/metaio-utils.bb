SUMMARY = "Command line tools for libmetaio"
DESCRIPTION = "This package contains command-line utilities such as lwtprint to be used with libmetaio."
LICENSE = "GPL-2.0-only"

PV = "8.5.1"

RPM_NAME = "metaio-utils-8.5.1-1.19.aarch64.rpm"
RPM_HASH = "7ab1757cda8694574f9c165085fd8192e555c54332482a0fcde9f8a3febcf5fa659643e243122882ab72ca2fbb1a048d2799223a890075f91d36b5aa149c1e21"

RPROVIDES:${PN} += "metaio-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmetaio.so.1"

inherit rpm
