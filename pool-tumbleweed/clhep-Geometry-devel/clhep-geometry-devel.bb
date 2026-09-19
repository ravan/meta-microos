SUMMARY = "Headers and sources for development with CLHEP Geometry library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Geometry library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Geometry-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "ee3b943314c4d4ef94eb388741d8d5928127f6301b9dbff020f8670bb11a71922f1255f70e316f33bd6778ca9998b71e21acc39baa55650493c5aca9fe843bf1"

RPROVIDES:${PN} += "clhep-Geometry-devel \
pkgconfig-clhep-geometry"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libCLHEP-Geometry-2-4-7-2 \
pkgconfig-clhep-vector"

inherit rpm
