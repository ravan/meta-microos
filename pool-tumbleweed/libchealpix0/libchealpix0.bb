SUMMARY = "Shared library for healpix - C bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the shared library for the C bindings of healpix."
LICENSE = "GPL-2.0-or-later"

PV = "3.83"

RPM_NAME = "libchealpix0-3.83-1.9.aarch64.rpm"
RPM_HASH = "dffac0056fee017940e6abed22ed10d97fac4f41b6169e4e0ee1e37f65928de82c32d55ce79eac98a33d6f818a606a6bc92853b756bc304e853f7bf607e84db1"

RPROVIDES:${PN} += "libchealpix.so.0 \
libchealpix0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libm.so.6"

inherit rpm
