SUMMARY = "Utilities to deal with geospatial links"
DESCRIPTION = "Python implementation of Cat-Interop utilities for geospatial links."
LICENSE = "MIT"

PV = "0.2.3"

RPM_NAME = "python314-geolinks-0.2.3-1.1.noarch.rpm"
RPM_HASH = "fd4e949fa59f21c7ddda829a28d75e91241bdb241f6858e9da2c0edfea36f09107e61ca3cc8754d10aa5cc013afb42c674f14d176748cf538192ad923f9ee9af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-geolinks \
python314-geolinks \
python3dist-geolinks"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-click"

inherit rpm
