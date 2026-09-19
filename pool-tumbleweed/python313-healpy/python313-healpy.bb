SUMMARY = "Python library to handle pixelated data on the sphere based on HEALPix"
DESCRIPTION = "healpy is a Python package to handle pixelated data on the sphere. It is based \
on the Hierarchical Equal Area isoLatitude Pixelization (HEALPix) scheme and \
bundles the HEALPix C++ library. \
 \
healpy provides utilities to: \
* convert between sky coordinates and pixel indices in HEALPix nested and ring schemes \
* find pixels within a disk, a polygon or a strip in the sky \
* apply coordinate transformations between Galactic, Ecliptic and Equatorial reference frames \
* apply custom rotations either to vectors or full maps \
* read and write HEALPix maps to disk in FITS format \
* upgrade and downgrade the resolution of existing HEALPix maps \
* visualize maps in Mollweide, Gnomonic and Cartographic projections \
* transform maps to Spherical Harmonics space and back using multi-threaded C++ routines \
* compute Auto and Cross Power Spectra from maps and create map realizations from spectra"
LICENSE = "GPL-2.0-only"

PV = "1.20.0"

RPM_NAME = "python313-healpy-1.20.0-1.1.aarch64.rpm"
RPM_HASH = "f21bd673bd097e8ed92b781f06846111488f016fcf49ca2548f4c2f8ded9c8e446677f32f291b1ba59c4308272ee60e93fede4cfac755e3ae448de176a8bc4a3"

RPROVIDES:${PN} += "python3-healpy \
python3.13dist-healpy \
python313-healpy \
python3dist-healpy"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhealpix-cxx.so.4 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-astropy \
python313-numpy \
update-alternatives"

inherit rpm
