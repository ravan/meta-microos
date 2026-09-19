SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python313-geolinks-0.2.3-1.1.noarch.rpm"
RPM_HASH = "5d472fb18f9f767b14012399e9c0e9c0d3f579e06d3612c301319fabd419f5af2c6a974757d0dd5d0834b97e674f1de400a449dc124bb0bb0c30e33a5fa52b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-geolinks \
python3.13dist-geolinks \
python313-geolinks \
python3dist-geolinks"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click"

inherit rpm
