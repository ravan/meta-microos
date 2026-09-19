SUMMARY = "Pure python ISO manipulation library"
DESCRIPTION = "PyCdlib is a pure python library to parse, write (master), and create ISO9660 \
files, suitable for writing to a CD or USB. \
 \
The original ISO9660 (including ISO9660-1999) specification is supported, as \
well the El Torito, Joliet, Rock Ridge, and UDF extensions. \
 \
Please see https://clalancette.github.io/pycdlib/ for much more documentation"
LICENSE = "LGPL-2.1-only"

PV = "1.16.0"

RPM_NAME = "python314-pycdlib-1.16.0-1.2.noarch.rpm"
RPM_HASH = "990b4d4e405ec51433cd0ec6c2454c503f8eba2291af81881a35058ca6ba518f1611d81ddfb1a02c8bd46f911dcca8bf780f01d3ecd643fe777ebe24be7da2bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pycdlib \
python314-pycdlib \
python3dist-pycdlib"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
mkisofs \
python-abi \
python3-pycdlib-common"

inherit rpm
