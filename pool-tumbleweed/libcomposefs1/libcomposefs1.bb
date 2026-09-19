SUMMARY = "Libraries for composefs"
DESCRIPTION = "Library files for composefs."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "1.0.8"

RPM_NAME = "libcomposefs1-1.0.8-3.11.aarch64.rpm"
RPM_HASH = "e2644e2c17ed2602e43da1aac4aaefa74bc8223bcb2b1112c86f6509990810d33b7fec394a10262421ffe1ca2f77761317fed243ff5d9489f5e06477faf531d5"

RPROVIDES:${PN} += "libcomposefs.so.1 \
libcomposefs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
