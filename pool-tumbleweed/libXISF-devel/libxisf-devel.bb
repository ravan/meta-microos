SUMMARY = "Development files for libXISF"
DESCRIPTION = "This package contains all the needed development files to use libXISF."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.13+git5.7b70b6a"

RPM_NAME = "libXISF-devel-0.2.13+git5.7b70b6a-1.4.aarch64.rpm"
RPM_HASH = "492d840abb286abcc6652acf00e87a0726559037566857a66f19a15543f8529f9971b0e2562d0ede4b20c2479b61598432094f5ce0a399e0380f805554bce5da"

RPROVIDES:${PN} += "libXISF-devel \
pkgconfig-libxisf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXISF0"

inherit rpm
