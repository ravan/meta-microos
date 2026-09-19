SUMMARY = "Library to support various HMACs"
DESCRIPTION = "A library to support various Hash-based Message Authentication Codes (HMAC)."
LICENSE = "LGPL-3.0-or-later"

PV = "20260522"

RPM_NAME = "libhmac1-20260522-1.10.aarch64.rpm"
RPM_HASH = "0504aa38fde840e1830c07ca9df9635b08058ec8589a2b24f93221de3619fe025bcf8fe6e784a99eba0a3318aaa3d342dda14dcabf7ed1d293e13df2178a99ee"

RPROVIDES:${PN} += "libhmac.so.1 \
libhmac1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcrypto.so.3"

inherit rpm
