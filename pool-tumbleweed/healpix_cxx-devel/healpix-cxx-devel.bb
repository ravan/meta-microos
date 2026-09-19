SUMMARY = "Headers and devel files for healpix - C++ bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the headers and devel files for building apps with \
healpix in the C++ language."
LICENSE = "GPL-2.0-or-later"

PV = "3.83"

RPM_NAME = "healpix_cxx-devel-3.83-1.9.aarch64.rpm"
RPM_HASH = "7f25df1bf7ec0cde8979615d691971ad38a11ad6d16af39d3d111818efb43ae1af882cb8681504edb027ae13203a3b084b17c8fc0c424e37a60171f94ec88037"

RPROVIDES:${PN} += "healpix-cxx-devel \
pkgconfig-healpix-cxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhealpix-cxx4 \
pkgconfig-cfitsio \
pkgconfig-libsharp \
pkgconfig-zlib"

inherit rpm
