SUMMARY = "Development files for matio"
DESCRIPTION = "matio is an open-source library for reading and writing MATLAB MAT files. \
This library is designed for use by programs/libraries that do not have \
access or do not want to rely on MATLAB's shared library."
LICENSE = "BSD-2-Clause"

PV = "1.5.30"

RPM_NAME = "libmatio-devel-1.5.30-1.4.aarch64.rpm"
RPM_HASH = "138d90ae8f9e7176b784279cf647c77c51cfecae195483527c4d75719cf8637a46e95c109ef172e36108c2234dadbe9d16f878ab139124c22b35c5e60ef771f7"

RPROVIDES:${PN} += "libmatio-devel \
pkgconfig-matio"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
hdf5-devel \
libmatio14 \
pkgconfig \
pkgconfig-hdf5 \
pkgconfig-zlib"

inherit rpm
