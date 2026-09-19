SUMMARY = "Data Analysis, Simulations and Visualization on the Sphere"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform."
LICENSE = "GPL-2.0-or-later"

PV = "3.83"

RPM_NAME = "healpix-3.83-1.9.aarch64.rpm"
RPM_HASH = "c1f8388e1daaacbc5ad740b267dbdc62d48215f5b669d4350ad5a7f81ed5e34c41ca25ec44d014913b8e2df666bb4a90e9c32facb2ec4ea8035fe0894ee4eba0"

RPROVIDES:${PN} += "healpix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libhealpix-cxx.so.4 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
