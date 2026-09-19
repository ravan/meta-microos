SUMMARY = "Tools for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the commandline tools for libavif."
LICENSE = "BSD-2-Clause & MIT"

PV = "1.4.2"

RPM_NAME = "avif-tools-1.4.2-1.4.aarch64.rpm"
RPM_HASH = "1ad0a4c9dd4205cbb31505a7e632569a46a1a7f5831f946deaeea1fccc44d24230cdc46d4cf43a5881c2514767558296cf9a257b58312132044a6da6770c0044"

RPROVIDES:${PN} += "avif-tools \
bundled-libargparse \
libavif-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.16 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
