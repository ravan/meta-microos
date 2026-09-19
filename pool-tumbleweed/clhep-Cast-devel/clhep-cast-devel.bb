SUMMARY = "Headers and sources for development with CLHEP Cast library"
DESCRIPTION = "This package provides the headers and sources for development with CLHEP Cast library."
LICENSE = "GPL-3.0-only | LGPL-3.0-only"

PV = "2.4.7.2"

RPM_NAME = "clhep-Cast-devel-2.4.7.2-1.4.aarch64.rpm"
RPM_HASH = "a7c98c9de95e8da3392bedd450da58327eb7c75d17312aa17390b6816fd40d4d30eccdd85ecded40d256e045d4b9872e12f28fd68b575ed8588a2cd07aceb2a5"

RPROVIDES:${PN} += "clhep-Cast-devel \
pkgconfig-clhep-cast"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libCLHEP-Cast-2-4-7-2"

inherit rpm
