SUMMARY = "Common files for Printrun"
DESCRIPTION = "Printrun is a set of G-code sending applications for RepRap. \
This package contains common files."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0+73"

RPM_NAME = "Printrun-common-2.2.0+73-1.6.aarch64.rpm"
RPM_HASH = "931669a06aaf9e58b4846dd30d3ebd12b488e8432f4a10b7886ed2e663ec5139e553b2b37ed09b7c9c0e98e5a0a44bca32348f8f1e73035a2bbadcb69c1fe6dd"

RPROVIDES:${PN} += "Printrun-common \
python3.13dist-printrun \
python3dist-printrun"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-numpy \
python3-pyglet \
python3-pyserial"

inherit rpm
