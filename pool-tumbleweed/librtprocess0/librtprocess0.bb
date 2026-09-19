SUMMARY = "Shared library for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the shared library."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20230627"

RPM_NAME = "librtprocess0-0.12.0+20230627-1.10.aarch64.rpm"
RPM_HASH = "0a3988433d49ae0f656ecf5c3664e075f8f29e5ea9329c031e625e1c8227a0c4fa45590b116450af445c77f1a97ba3daeac32222e2059b5fa2b98ab8da0fa098"

RPROVIDES:${PN} += "librtprocess.so.0 \
librtprocess0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
