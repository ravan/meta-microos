SUMMARY = "Development files for wcslib"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use wcslib."
LICENSE = "LGPL-3.0-or-later"

PV = "8.6"

RPM_NAME = "wcslib-devel-8.6-1.3.aarch64.rpm"
RPM_HASH = "07415d12bf5456e66d91471036ea12698a443cc505433ebb1c228f29f622ba6487c833cae01417b4fbc262a59f72183c45e3be9a245179897354d636d53d8d3c"

RPROVIDES:${PN} += "libwcs-devel \
pkgconfig-wcslib \
wcslib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cfitsio-devel \
libwcs8"

inherit rpm
