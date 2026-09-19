SUMMARY = "MaxMind GeoIP2 Python API"
DESCRIPTION = "This package provides an API for the GeoIP2 web services and databases. \
The API also works with MaxMind's free GeoLite2 databases."
LICENSE = "Apache-2.0"

PV = "5.3.0"

RPM_NAME = "python313-geoip2-5.3.0-1.1.noarch.rpm"
RPM_HASH = "89727992d1abd59f0cf71ffd55b67fd3b2376eeab016531a2a5b4cb8f2a65ce8f18a8ea76d453a91c720c0b6897455d8f65c78cf21f9f051a444082d118be502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geoip2 \
python3.13dist-geoip2 \
python313-geoip2 \
python3dist-geoip2"

RDEPENDS:${PN} += "python-abi \
python313-aiohttp \
python313-maxminddb \
python313-requests"

inherit rpm
