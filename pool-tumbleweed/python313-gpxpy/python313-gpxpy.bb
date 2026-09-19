SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "python313-gpxpy-1.6.2-3.5.noarch.rpm"
RPM_HASH = "47eb9dd3190727d48dd1b4509c76d1170de30fc527073928d15f49de6f732456e04fc6064b8f00c462199b4e8c445613cf9c62effffab17a566ae932032627cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gpxpy \
python3.13dist-gpxpy \
python313-gpxpy \
python3dist-gpxpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
