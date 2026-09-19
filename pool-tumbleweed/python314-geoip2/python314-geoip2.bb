SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "python314-geoip2-5.3.0-1.1.noarch.rpm"
RPM_HASH = "9bad0af68e848bb5107c168b8455b84c52cc2a3a57eebb46aa4994e06e5193a21ad46b7b0d8fce17dea706e8efff8dbf42cf0eb7aa7ebe51c8321729625a18b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geoip2 \
python314-geoip2 \
python3dist-geoip2"

RDEPENDS:${PN} += "python-abi \
python314-aiohttp \
python314-maxminddb \
python314-requests"

inherit rpm
