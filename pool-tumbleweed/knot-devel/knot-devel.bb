SUMMARY = "Development files for the knot libraries"
DESCRIPTION = "Knot DNS is a DNS server. It implements only the authoritative domain \
name service. It uses a multi-threaded and mostly lock-free \
implementation and can operate non-stop during zone addition or \
removal. \
 \
This package contains headers for knot."
LICENSE = "GPL-2.0-or-later"

PV = "3.6.0"

RPM_NAME = "knot-devel-3.6.0-1.1.aarch64.rpm"
RPM_HASH = "475c739edf17c454749d0992675a484fcd5ddbf042804b9820713b7865388a828ecf6f58c2e4c6d35a57471de09cb6ab233714e027583ab8c7b60201fa7d2b5d"

RPROVIDES:${PN} += "knot-devel \
pkgconfig-knotd \
pkgconfig-libknot \
pkgconfig-libzscanner"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
knot \
libknot17 \
libzscanner5"

inherit rpm
