SUMMARY = "Headers and devel files for healpix - C bindings"
DESCRIPTION = "HEALPix is a Hierarchical, Equal Area, and iso-Latitude Pixelation of the \
sphere designed to support efficiently (1) local operations on the pixel set, \
(2) a hierarchical tree structure for multi-resolution applications, and (3) \
the global Fast Spherical Harmonic transform. \
 \
This package provides the headers and devel files for building apps with \
healpix in the C language."
LICENSE = "GPL-2.0-or-later"

PV = "3.83"

RPM_NAME = "chealpix-devel-3.83-1.9.aarch64.rpm"
RPM_HASH = "7842e03e36f8fc98652dbe975c4a2eab5472b0b101192d2a9a024cfc959399615ee9ca9537a19cb8aec379f87101a3ecb12307001dc6296d1087c5f581d8488b"

RPROVIDES:${PN} += "chealpix-devel \
pkgconfig-chealpix"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchealpix0 \
pkgconfig-cfitsio \
pkgconfig-libsharp"

inherit rpm
