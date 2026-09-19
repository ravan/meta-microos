SUMMARY = "Library for querying compressed XML metadata"
DESCRIPTION = "This package provides the shared library for libxmlb."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.29"

RPM_NAME = "libxmlb2-0.3.29-2.1.aarch64.rpm"
RPM_HASH = "5272cb9ff003aaadcd7b16ca749d99c661c2cce1d9b1fc04c40a1ced64b8b65f148cce74d80452328c4b25cee91fbdab656ab66fbc3be9ce3adbb98c176821a1"

RPROVIDES:${PN} += "libxmlb.so.2 \
libxmlb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libstemmer.so.0d \
libzstd.so.1"

inherit rpm
