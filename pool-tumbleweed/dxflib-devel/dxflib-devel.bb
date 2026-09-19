SUMMARY = "Development files for dxflib, a DXF parsing library"
DESCRIPTION = "dxflib is a C++ library mainly for parsing and writing DXF files. \
 \
This package contains the development library symlink and header \
files."
LICENSE = "GPL-2.0-or-later"

PV = "3.26.4"

RPM_NAME = "dxflib-devel-3.26.4-2.18.aarch64.rpm"
RPM_HASH = "20481f2240f0e8dbe5028e4250f856370e4e1994d28dc80379f239ab6aee5adc3d9383d499e58f55287b1d942ad7f8dd1aa6f4297df8335bc1b47f399627cdd6"

RPROVIDES:${PN} += "dxflib-devel \
pkgconfig-dxflib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdxflib-3-26-4-1"

inherit rpm
