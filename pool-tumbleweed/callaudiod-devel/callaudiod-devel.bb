SUMMARY = "Development files for callaudiod"
DESCRIPTION = "A daemon for audio calls. \
This package contains the development and header files for callaudiod."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.1.99"

RPM_NAME = "callaudiod-devel-0.1.99-2.1.aarch64.rpm"
RPM_HASH = "101e424277031447b578455569c4d4c155db82fda6d4634c7010a2fc1e1f368e1fb6a46e0ba28958599df3f7f1029f12183c45b11117e40b3a0feee8db0886a2"

RPROVIDES:${PN} += "callaudiod-devel \
pkgconfig-libcallaudio-0.1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
callaudiod \
libcallaudio0-1-0 \
pkgconfig-gio-2.0"

inherit rpm
