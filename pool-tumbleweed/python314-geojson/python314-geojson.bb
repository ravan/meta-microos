SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python314-geojson-3.3.0-1.1.noarch.rpm"
RPM_HASH = "d5ab6c42ebd50d5cb5c1845fc9d7659efa1d39f89bd899fbc57d653903f143deb2eebad0a5371c523ba558f8011a5ca7c45be07a915a1374a4546711cb72818f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geojson \
python314-geojson \
python3dist-geojson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
