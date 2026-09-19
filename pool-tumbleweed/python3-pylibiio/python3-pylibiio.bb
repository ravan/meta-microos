SUMMARY = "Industrial I/O library -- Python bindings"
DESCRIPTION = "Library for industrial I/O. \
 \
This sub-package contains the Python bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.26"

RPM_NAME = "python3-pylibiio-0.26-1.10.aarch64.rpm"
RPM_HASH = "82e5d0e178b6a86fbded788d443db8e2d704f8033b8aaee1ddc4270cc63728ccb92c251769c2584612e9c05d35727f0b773b4216974e9a5631147b7e58a31c31"

RPROVIDES:${PN} += "libiio-python \
python3-pylibiio \
python3.13dist-pylibiio \
python3dist-pylibiio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
