SUMMARY = "Free Geolocation Country Data"
DESCRIPTION = "This package includes GeoLite2 data created by MaxMind, available from \
https://www.maxmind.com"
LICENSE = "CC-BY-SA-4.0"

PV = "2026.08.31"

RPM_NAME = "GeoLite2-Country-2026.08.31-1.1.noarch.rpm"
RPM_HASH = "831db02f3d3946ab5cf57b2d9bf48df23604db1dfcd5f861ddf385a54304693ac6932e6139f0be5b5897fd21e726ed369123608ca56e4d4bf26e1db77ee82bd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "GeoLite2-Country"

RDEPENDS:${PN} += ""

inherit rpm
