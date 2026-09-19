SUMMARY = "Shared library for gretl"
DESCRIPTION = "This package contains the shared libraries for gretl."
LICENSE = "GPL-3.0-only"

PV = "2025a"

RPM_NAME = "libgretl-1_0-51-2025a-1.7.aarch64.rpm"
RPM_HASH = "c30e8eeecbf2a1f8a1af621c9cb382fcce41dc42566ce9ed9f14bae77ab415a5ab760417da75b0c31221a3331f36f334e958c5c4dd26ad6ba1f57f71a04257bf"

RPROVIDES:${PN} += "libgretl-1-0-51 \
libgretl-1.0.so.51"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcurl.so.4 \
libfftw3.so.3 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgomp.so.1 \
libgsf-1.so.114 \
liblapack.so.3 \
libm.so.6 \
libxml2.so.16 \
libz.so.1"

inherit rpm
