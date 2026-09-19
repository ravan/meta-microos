SUMMARY = "Python Bindings for the CDIO Library"
DESCRIPTION = "pycdio is a Python interface to the CD Input and Control library (libcdio). \
 \
The pycdio (and libcdio) libraries encapsulate CD-ROM reading and control. \
Python programs wishing to be oblivious of the OS- and device-dependent \
properties of a CD-ROM can use this library."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python314-pycdio-2.1.1-2.8.aarch64.rpm"
RPM_HASH = "568e519b16eab4b782f62aa930783e6e5ac6701de4e47f7851829fac0b8b2f38fb13c648dc19258bd1ead2a364fcbb0b7d1d967e0dda370a4ee4ad463eccd3d0"

RPROVIDES:${PN} += "python3.14dist-pycdio \
python314-pycdio \
python3dist-pycdio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdio.so.19 \
libiso9660.so.12 \
python-abi"

inherit rpm
