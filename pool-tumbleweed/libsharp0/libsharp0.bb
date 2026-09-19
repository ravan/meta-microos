SUMMARY = "Shared library for libsharp -- a spherical harmonic transforms library"
DESCRIPTION = "libsharp is a code library for spherical harmonic transforms (SHTs). \
 \
This package provides the shared library for libsharp."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "libsharp0-1.0.0-1.22.aarch64.rpm"
RPM_HASH = "8b7c42a6d3184b7eea598d442a628ea8f08a88095a496f1c8cc7c93322dc7aa0f09fe3a881e5e53a49426b337bcd1dc1288307facd66f3e8f3bf4190b2f4941e"

RPROVIDES:${PN} += "libsharp.so.0 \
libsharp0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
