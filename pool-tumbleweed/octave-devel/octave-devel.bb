SUMMARY = "Development files for Octave"
DESCRIPTION = "Octave is a high level programming language. It is designed for the \
solution of numeric problems. \
 \
This package contains all necessary include files and libraries needed \
to develop applications using Octave."
LICENSE = "GPL-3.0-or-later"

PV = "11.3.0"

RPM_NAME = "octave-devel-11.3.0-1.2.aarch64.rpm"
RPM_HASH = "11b2f5e9daf3aeb0a7674fe0b0f51d2be8791061aaaf6f91bb242139eabb131870cfcb191957ddef29395806dfbbdd5e0250a5b45891045aa1b7b2eb8a7f69d6"

RPROVIDES:${PN} += "octave-devel \
pkgconfig-octave \
pkgconfig-octinterp \
pkgconfig-octmex \
rpm-macro-octave \
rpm-macro-octave-api \
rpm-macro-octave-blas \
rpm-macro-octave-pkg-build \
rpm-macro-octave-pkg-install \
rpm-macro-octave-pkg-src \
rpm-macro-octave-pkg-test \
rpm-macro-octlib-dir \
rpm-macro-octpackages-dir \
rpm-macro-octskiptests \
rpm-macro-octsysw-settings"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fftw3-devel \
fftw3-threads-devel \
gcc-c++ \
gcc-fortran \
hdf5-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
make \
octave-cli \
openblas-devel \
pkgconfig-octinterp"

inherit rpm
