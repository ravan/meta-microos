SUMMARY = "MPEG audio decoder library"
DESCRIPTION = "MPEG 1.0/2.0/2.5 audio decoder library for layers 1, 2 and 3 (most \
commonly MPEG 1.0 Layer 3 aka MP3)."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "libmpg123-0-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "6f51db718888b58e9f6da3206ba460cbc448c88f6492170273e3955b304ca008ff3a05566a94be2d0f8d9e47062b2111546af2b94538035591bcf41c4ea5217f"

RPROVIDES:${PN} += "libmpg123-0 \
libmpg123.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
