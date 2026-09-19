SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "casacore-devel-3.8.0-1.6.aarch64.rpm"
RPM_HASH = "6cde242716bff0969037553d5f8592d70e015d9bed535197942312d1ff7f1ddc8dd294bd9bcc67c5b5f01febab5a8520ed8a5ea5c2058e674c9f7f7527801bf1"

RPROVIDES:${PN} += "casacore-devel \
pkgconfig-casacore"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore9 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
