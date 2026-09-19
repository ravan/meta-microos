SUMMARY = "Modified version of libshout for Internet DJ Console"
DESCRIPTION = "Modified version of libshout for Internet DJ Console (IDJC). \
libshout-idjc supports the transfer of AAC, AAC+ streams \
and MPEG ADTS."
LICENSE = "LGPL-2.0-only"

PV = "2.4.6.r2"

RPM_NAME = "libshout-idjc3-2.4.6.r2-1.4.aarch64.rpm"
RPM_HASH = "1bb8cfc9491ec6a044ec9c2e719c3926c00a3976c7ce803195207d98de330bf23e01a8c794156435b0c545878cb728d8274814899fac9fc67c3e922b45b1a9a4"

RPROVIDES:${PN} += "libshout-idjc.so.3 \
libshout-idjc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libogg.so.0 \
libspeex.so.1 \
libssl.so.3 \
libtheora.so.1 \
libvorbis.so.0"

inherit rpm
