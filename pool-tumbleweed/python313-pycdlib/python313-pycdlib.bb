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

RPM_NAME = "python313-pycdlib-1.16.0-1.2.noarch.rpm"
RPM_HASH = "31a5a4d425dac05bbe0c853e944d84a9aaf6e9e692daaa0b64d6ae80e98a0c48db941323b04fa54d2195c04a1a631a7b571d232aa092f6204e90cce1d7c153c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycdlib \
python3.13dist-pycdlib \
python313-pycdlib \
python3dist-pycdlib"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
mkisofs \
python-abi \
python3-pycdlib-common"

inherit rpm
