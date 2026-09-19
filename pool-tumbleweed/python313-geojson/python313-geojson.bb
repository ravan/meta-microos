SUMMARY = "Python bindings and utilities for GeoJSON"
DESCRIPTION = "This library contains functions for encoding and decoding GeoJSON formatted \
data, classes for all GeoJSON Objects and an implementation of the Python \
geo interface specification."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python313-geojson-3.3.0-1.1.noarch.rpm"
RPM_HASH = "52d1e37609248f9639441c039379ab861bd6f8bccb682db7de84121d5ac13879de004b41aaa592a0b92e5f66c90fc0392178744e0c1358f4d43abbe1cda654ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geojson \
python3.13dist-geojson \
python313-geojson \
python3dist-geojson"

RDEPENDS:${PN} += "python-abi"

inherit rpm
