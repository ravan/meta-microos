SUMMARY = "Free Geolocation City Data"
DESCRIPTION = "This package includes GeoLite2 data created by MaxMind, available from \
https://www.maxmind.com"
LICENSE = "CC-BY-SA-4.0"

PV = "2026.08.31"

RPM_NAME = "GeoLite2-City-2026.08.31-1.1.noarch.rpm"
RPM_HASH = "fd580ca4700690f73cdec2309accb99ab50c220a8e9d33fd50ea5064e260bb4f2551264c210a0a3df96fd3400d6abc63fb6eb3fc9395c53e070518cb5e101815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "GeoLite2-City"

RDEPENDS:${PN} += ""

inherit rpm
