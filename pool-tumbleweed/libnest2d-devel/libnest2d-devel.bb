SUMMARY = "Library for the 2D bin packaging problem"
DESCRIPTION = "A library and framework for the 2D bin packaging problem."
LICENSE = "LGPL-3.0-only"

PV = "0.4+git.20201105"

RPM_NAME = "libnest2d-devel-0.4+git.20201105-1.19.aarch64.rpm"
RPM_HASH = "c901566559b1b544d583c5879b0c50b8ef55c9a4fae81a4d059bdfc6ce583f719b15df1644febafa28a30cb2435f41315e39ba45cf20a3111a4c7c7f278bfa63"

RPROVIDES:${PN} += "cmake-Libnest2D \
libnest2d-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libpolyclipping-devel \
pkgconfig-nlopt"

inherit rpm
