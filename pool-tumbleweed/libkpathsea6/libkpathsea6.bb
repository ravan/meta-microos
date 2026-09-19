SUMMARY = "Path searching library for TeX-related files"
DESCRIPTION = "Kpathsea is a library and utility programs which provide path \
searching facilities for TeX file types, including the self- \
locating feature required for movable installations, layered on \
top of a general search mechanism. It is not distributed \
separately, but rather is released and maintained as part of \
the TeX-live sources."
LICENSE = "LGPL-2.1-or-later"

PV = "6.4.2"

RPM_NAME = "libkpathsea6-6.4.2-120.4.aarch64.rpm"
RPM_HASH = "a8614f2c14b2e0c44f81a6c88e0525709118bd2b17fb202966fb60003eabdfd065b2b64f5c7a9b81e2437355ad8ef8567caeba5470dfc1545c9fb3c722a6d8c4"

RPROVIDES:${PN} += "libkpathsea.so.6 \
libkpathsea6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
