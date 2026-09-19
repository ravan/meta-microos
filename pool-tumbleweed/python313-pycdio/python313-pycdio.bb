SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python313-pycdio-2.1.1-2.8.aarch64.rpm"
RPM_HASH = "746d3055326525e0190f377d0d1c656d2de85b7f26cfe0dab515a58d8fbd93d4d76e2d238655c760bd032dbb924b9f67b08e7debc8561f8840394693cd6821f5"

RPROVIDES:${PN} += "python3-pycdio \
python3.13dist-pycdio \
python313-pycdio \
python3dist-pycdio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.12 \
python-abi"

inherit rpm
