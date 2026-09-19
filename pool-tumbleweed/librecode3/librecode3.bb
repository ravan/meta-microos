SUMMARY = "Recode shared library"
DESCRIPTION = "Recode converts files between various character sets. \
 \
This package contains librecode shared library for embedding in \
other applications."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.7.15"

RPM_NAME = "librecode3-3.7.15-2.5.aarch64.rpm"
RPM_HASH = "d9bbba7c07cb749ef59783587ce121cce97a3b3a3d024e6084bd10bd39948648e96740cc12d3b1b3eb23d9c69ca6db25eef25dbb75d1e518d9f694e0a41f7ff0"

RPROVIDES:${PN} += "librecode.so.3 \
librecode3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
