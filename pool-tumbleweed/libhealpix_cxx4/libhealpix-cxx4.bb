SUMMARY = "Shared library for healpix - C++ bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the shared library for the C++ bindings of healpix."
LICENSE = "GPL-2.0-or-later"

PV = "3.83"

RPM_NAME = "libhealpix_cxx4-3.83-1.9.aarch64.rpm"
RPM_HASH = "337d994bdedf7a2c723b0edf9eb894744bcc1decf9c705fd5b10636a7a63c380b4475e14e58d82df8add5b515dfe31a14ea6a7a8b41416120de32be1775f6c9c"

RPROVIDES:${PN} += "libhealpix-cxx.so.4 \
libhealpix-cxx4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcfitsio.so.10 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libsharp.so.0 \
libstdc++.so.6"

inherit rpm
