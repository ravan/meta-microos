SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "casacore-openmpi4-devel-3.8.0-1.6.aarch64.rpm"
RPM_HASH = "064b3e6bb335a1983b378b5a1aa65be2cd8a14e3303fbd8f874c4f156327d1949c9e11d9c1621dab26db0a092fa692c56dc7beae3ecb1d720616d16d862c04d6"

RPROVIDES:${PN} += "casacore-openmpi4-devel"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore9-openmpi4 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
