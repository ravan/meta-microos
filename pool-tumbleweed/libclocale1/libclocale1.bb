SUMMARY = "Library for C locale functions"
DESCRIPTION = "A library for C locale functions."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libclocale1-20260703-1.2.aarch64.rpm"
RPM_HASH = "f4e9f705461d1cfeab5112d47580defcaa3ae8771fb6403f87720bd9db034460800c5f7c05dfa5ee56fef9443443b0c5c0da999d1203b83b1ea9a23c155aaa89"

RPROVIDES:${PN} += "libclocale.so.1 \
libclocale1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1"

inherit rpm
