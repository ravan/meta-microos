SUMMARY = "Development files for LAL Burst"
DESCRIPTION = "This package contains sources and header files needed to build applications \
that use the LAL Burst library."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "lalburst-devel-2.0.7-2.1.aarch64.rpm"
RPM_HASH = "fae8a3c82fbda42c7a4797f1d18d2255d0cae84afe3da815a4b765054507985d032c43df3ca41238c2af3d48ac8d64bc244f67ece67a45a24ab4c73041fa3368"

RPROVIDES:${PN} += "config-lalburst-devel \
lalburst-devel \
pkgconfig-lalburst"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblal.so.20 \
liblalburst.so.8 \
liblalburst8 \
pkgconfig-gsl \
pkgconfig-lal \
pkgconfig-lalmetaio \
pkgconfig-lalsimulation \
pkgconfig-libmetaio"

inherit rpm
