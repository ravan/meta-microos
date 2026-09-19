SUMMARY = "C git library"
DESCRIPTION = "libgit2 is a portable, pure C implementation of the Git core methods \
provided as a re-entrant linkable library with a solid API, allowing \
you to write native speed custom Git applications in any language \
with bindings."
LICENSE = "GPL-2.0-only-with-GCC-exception-2.0"

PV = "1.9.7"

RPM_NAME = "libgit2-1_9-1.9.7-1.1.aarch64.rpm"
RPM_HASH = "e6f899a745f2f07a1d8dea6dc814c155f66529927b3d1787f9a8885ffe01e8d5158a322b501a99d597301e424183cfad76686f3fae3b28f7053bc312d20b3a77"

RPROVIDES:${PN} += "libgit2-1-9 \
libgit2.so.1.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libpcre2-8.so.0 \
libssh2.so.1 \
libssl.so.3 \
libz.so.1"

inherit rpm
