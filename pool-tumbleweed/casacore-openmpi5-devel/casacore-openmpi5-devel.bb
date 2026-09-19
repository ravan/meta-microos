SUMMARY = "Headers and sources for developing with casacore"
DESCRIPTION = "Casacore provides a suite of C++ libraries for radio astronomy data processing. \
 \
This package provides the headers and sources for developing software with casacore."
LICENSE = "LGPL-2.0-or-later"

PV = "3.8.0"

RPM_NAME = "casacore-openmpi5-devel-3.8.0-1.5.aarch64.rpm"
RPM_HASH = "8d88fc659cd9e1dbcfa8dd6953b004c601a67f3e35114af6f9cda8f158022166788acf89e7f673f15ec54cfab8f67b5db33c6f04c0d90562829b664ef5b88259"

RPROVIDES:${PN} += "casacore-openmpi5-devel"

RDEPENDS:${PN} += "gsl-devel \
hdf5-devel \
lapack-devel \
libboost-python3-devel \
libcasacore9-openmpi5 \
pkgconfig-cfitsio \
pkgconfig-fftw3 \
pkgconfig-ncurses \
pkgconfig-wcslib \
readline-devel"

inherit rpm
