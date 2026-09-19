SUMMARY = "Development files for LAL Inspiral"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Inspiral library."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.3"

RPM_NAME = "lalinspiral-devel-5.0.3-2.1.aarch64.rpm"
RPM_HASH = "0b594ea2de345d41f7d4035f4e32c49f0cb253d581cb62971059cde75bfb57f1f1d96f9db97da8f0d3ba79446ef26f27833677bbc8689d2d15a7a532dc5c3497"

RPROVIDES:${PN} += "config-lalinspiral-devel \
lalinspiral-devel \
pkgconfig-lalinspiral"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalinspiral.so.18 \
liblalinspiral18 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-lalburst \
pkgconfig-lalframe \
pkgconfig-lalmetaio \
pkgconfig-lalsimulation \
pkgconfig-libmetaio"

inherit rpm
