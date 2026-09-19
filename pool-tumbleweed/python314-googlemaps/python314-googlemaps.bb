SUMMARY = "Python client library for Google Maps API Web Services"
DESCRIPTION = "Geocoding, reverse geocoding, driving directions, and local search in \
Python via Google."
LICENSE = "Apache-2.0"

PV = "4.10.0"

RPM_NAME = "python314-googlemaps-4.10.0-1.1.noarch.rpm"
RPM_HASH = "1a7b6ad0f1fb0234cc459096ac8372e654c6cba9729d9c9d813a3ba7c3c62686c8072ead5f054b5caa8dcdfe8c8d451380f98b11583cc1c7b7cd7f6e9c949b12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-googlemaps \
python314-googlemaps \
python3dist-googlemaps"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
