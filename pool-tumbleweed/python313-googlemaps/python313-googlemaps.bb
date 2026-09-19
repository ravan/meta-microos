SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python313-googlemaps-4.10.0-1.1.noarch.rpm"
RPM_HASH = "d84b2ca2a64aecd67d298ac253f3ee682bc3f83951721f36c57ae145cd0234a23b9ad48f2867ab1bd60a513829224d3cc89457f12275729d1460ade239253e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-googlemaps \
python3.13dist-googlemaps \
python313-googlemaps \
python3dist-googlemaps"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
