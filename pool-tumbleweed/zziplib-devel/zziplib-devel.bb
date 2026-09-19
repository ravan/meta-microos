SUMMARY = "Development files for zziplib, a ZIP compression library"
DESCRIPTION = "That are the header files needed for developing applications using \
ZZipLib."
LICENSE = "LGPL-2.1-or-later"

PV = "0.13.80"

RPM_NAME = "zziplib-devel-0.13.80-1.5.aarch64.rpm"
RPM_HASH = "a06251fc3d8433f792ba4c7d1a2b89ad4effd2d52a165b52544b00d9f838510fe8d716111e8ace130fa42d9e59a7b9fd4dc21892531852833db87b223a42425f"

RPROVIDES:${PN} += "pkgconfig-zzipfseeko \
pkgconfig-zziplib \
pkgconfig-zzipmmapped \
pkgconfig-zzipwrap \
zziplib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzzip-0-13 \
libzzip.so.13 \
libzzipfseeko.so.13 \
libzzipmmapped.so.13 \
pkgconfig-zlib \
pkgconfig-zziplib"

inherit rpm
