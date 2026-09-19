SUMMARY = "Development files for the Osmocom sigtran library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN. \
 \
This subpackage contains the development files for the Osmocom \
SIGTRAN library."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "libosmo-sigtran-devel-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "38bfe3819b97c7ff0bc5bb085a5fa203f2df164327cb06502d0a691f633f862d82b7430eb799a9fd6ab349774d59012ef899d48922e6c4f5c8a7919037b86a23"

RPROVIDES:${PN} += "libosmo-sigtran-devel \
pkgconfig-libosmo-sigtran"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-sigtran12 \
pkgconfig-libosmo-asn1-tcap \
pkgconfig-libosmo-netif \
pkgconfig-libosmocore"

inherit rpm
