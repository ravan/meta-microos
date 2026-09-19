SUMMARY = "Mapserver development files"
DESCRIPTION = "The Mapserver development package provides necessary files to build \
against the C Mapserver library."
LICENSE = "MIT"

PV = "8.6.6"

RPM_NAME = "mapserver-devel-8.6.6-1.1.aarch64.rpm"
RPM_HASH = "3aee9b7efd60d69af3193cff27f5cc2140fd4064352f71fa4e1ff126bfec71116ba4119da383dcc3031d155cbd9618dd9f0d171e2e3bfab736feb8bc4e7704b4"

RPROVIDES:${PN} += "mapserver-devel"

RDEPENDS:${PN} += "libmapserver2"

inherit rpm
