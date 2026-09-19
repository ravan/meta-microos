SUMMARY = "Free Geolocation ASN Data"
DESCRIPTION = "This package includes GeoLite2 data created by MaxMind, available from \
https://www.maxmind.com"
LICENSE = "CC-BY-SA-4.0"

PV = "2026.08.31"

RPM_NAME = "GeoLite2-ASN-2026.08.31-1.1.noarch.rpm"
RPM_HASH = "a5cd889bd2e992240bead60182b4c6f5e4a0b4ea960c66633f4ab96c32404d3d123dea8c318f1517213d3defeee4a470faccadd02006673453bc7be330059c43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "GeoLite2-ASN"

RDEPENDS:${PN} += ""

inherit rpm
