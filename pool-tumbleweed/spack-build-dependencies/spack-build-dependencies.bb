SUMMARY = "Spack Build Dependencies"
DESCRIPTION = "This package provides dependencies to packages of some frequently used \
build tools. If Spack finds these on the system it will not attempt to \
build them."
LICENSE = "Apache-2.0 & MIT & Python-2.0 & BSD-3-Clause"

PV = "0.23.1"

RPM_NAME = "spack-build-dependencies-0.23.1-2.6.noarch.rpm"
RPM_HASH = "0c5e95f1f55cd27858284176b9156cccd43ab39b17e0d1ce379b366959975e81c2cbcbae609e911a4196969aab94760d7869eb51ef3db013cd638020f2650303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "spack-build-dependencies"

RDEPENDS:${PN} += "bison \
cmake-full \
flex \
libcurl-devel \
libopenssl-devel \
libtool \
libzip-devel \
ncurses-devel \
xz-devel \
zip"

inherit rpm
