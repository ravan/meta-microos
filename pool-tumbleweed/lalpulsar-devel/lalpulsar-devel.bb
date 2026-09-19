SUMMARY = "Development files for LAL Pulsar"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Pulsar library."
LICENSE = "GPL-2.0-or-later"

PV = "7.1.1"

RPM_NAME = "lalpulsar-devel-7.1.1-2.1.aarch64.rpm"
RPM_HASH = "b44fe91fa561d741b30fab3766b9be98bda52d72a722bb3d98d8f7ef551e9415497a16c30409a18308f7f7a5b1129429edc2549fcd304234b77793d1f3956d45"

RPROVIDES:${PN} += "config-lalpulsar-devel \
lalpulsar-devel \
pkgconfig-lalpulsar"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libfftw3.so.3 \
libgsl.so.28 \
liblal.so.20 \
liblalframe.so.14 \
liblalinference.so.23 \
liblalpulsar.so.30 \
liblalpulsar30 \
liblalsimulation.so.37 \
liblalsupport.so.14 \
libm.so.6 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-lalframe \
pkgconfig-lalinference \
pkgconfig-lalsimulation"

inherit rpm
