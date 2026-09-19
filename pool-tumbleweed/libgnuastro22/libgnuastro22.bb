SUMMARY = "Libraries for the GNU Astronomy Utilities"
DESCRIPTION = "Libraries for the manipulation and analysis of astronomical data, \
part of the GNU Astronomy Utilities (Gnuastro)."
LICENSE = "GPL-3.0-or-later"

PV = "0.24"

RPM_NAME = "libgnuastro22-0.24-1.5.aarch64.rpm"
RPM_HASH = "56ffad24b93f97cbb59e0d9525e68cef49e2819a96d3d6886a3c3323491f53eb917d8f708e68da04d4baad113995f27637306c06bf25f88abfa27021a1b6d0a3"

RPROVIDES:${PN} += "libgnuastro.so.22 \
libgnuastro22"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgit2.so.1.9 \
libgsl.so.28 \
libgslcblas.so.0 \
libjpeg.so.8 \
libm.so.6 \
libtiff.so.6 \
libwcs.so.8"

inherit rpm
