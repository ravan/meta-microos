SUMMARY = "Development files for muParserX"
DESCRIPTION = "The muparserx development files. A C++ Library for Parsing Expressions with \
Strings, Complex Numbers, Vectors, Matrices and more."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "muparserx-devel-4.0.12-2.6.aarch64.rpm"
RPM_HASH = "113fd38182a04123afab621dfb45dfabe33ab71905f80c8e52491cb483456f903ffbe56cf68a05748c429ececf2df8d4d7d7600f68ba694c80f27f29aacb0c9b"

RPROVIDES:${PN} += "cmake-muparserx \
muparserx-devel \
pkgconfig-muparserx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmuparserx4-0-12"

inherit rpm
