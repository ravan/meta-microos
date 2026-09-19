SUMMARY = "System libraries for libicns"
DESCRIPTION = "System libraries file for libicns."
LICENSE = "LGPL-2.1-only"

PV = "0.8.1+git20201014"

RPM_NAME = "libicns1-0.8.1+git20201014-1.23.aarch64.rpm"
RPM_HASH = "3046e18e192d0e12031d4051a148ba667fcb54fb4e44911455a84caa4a253d257cb5c75a562937ef28b9c0e1f6857a8c151890528d07a45f5bcab5106f703e71"

RPROVIDES:${PN} += "libicns.so.1 \
libicns1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libopenjp2.so.7 \
libpng16.so.16"

inherit rpm
