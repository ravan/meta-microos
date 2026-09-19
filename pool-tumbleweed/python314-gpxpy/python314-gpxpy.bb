SUMMARY = "GPX file parser and GPS track manipulation library"
DESCRIPTION = "A Python library for parsing and manipulating GPX files. \
GPX is an XML based format for GPS tracks."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "python314-gpxpy-1.6.2-3.5.noarch.rpm"
RPM_HASH = "02610facf11d8be6a0a9c3f9f8e5589a27fbee52ae6f0de6615138cfc957dcfbda0e95ca1d591ec5620cd941478e52424d90b38cf6539dfe395a40636371a8e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gpxpy \
python314-gpxpy \
python3dist-gpxpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
