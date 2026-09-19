SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.3.10"

RPM_NAME = "fftw3-devel-3.3.10-6.6.aarch64.rpm"
RPM_HASH = "38c29cad81b7e8756ec22f0eca4442e7e3ebf96e0cdcd931710673034a381987ac2a839645dd24565b2f99c718026d8839d29cc47ebdb3bc56fc2059f299d486"

RPROVIDES:${PN} += "fftw-devel \
fftw3-devel \
pkgconfig-fftw3 \
pkgconfig-fftw3f \
pkgconfig-fftw3l"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3-3 \
libfftw3-threads.so.3 \
libfftw3.so.3 \
libfftw3f-threads.so.3 \
libfftw3f.so.3 \
libfftw3l-threads.so.3 \
libfftw3l.so.3"

inherit rpm
