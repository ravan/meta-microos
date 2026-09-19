SUMMARY = "Development files for MLT's C and C++ language API"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
This subpackage contains the headers to make use of the MLT C and \
C++ API."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "libmlt-devel-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "5b6a2f2dbe33e62ccac20685f0a6394f76ef756ffb73c0a3c22a575bda2d4ff7c277adfc2d2a85b8e9e2d79093c747e9d116a743f715d8b20ec57356292a0bb8"

RPROVIDES:${PN} += "cmake-Mlt7 \
libmlt++-devel \
libmlt-devel \
pkgconfig-mlt++-7 \
pkgconfig-mlt-framework-7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmlt++-7-7 \
libmlt-7-7 \
pkgconfig-mlt-framework-7"

inherit rpm
