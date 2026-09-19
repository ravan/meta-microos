SUMMARY = "Community-developed python astronomy tools"
DESCRIPTION = "Astropy is a package intended to contain core functionality and some \
common tools needed for performing astronomy and astrophysics research with \
Python. It also provides an index for other astronomy packages and tools for \
managing them."
LICENSE = "BSD-3-Clause"

PV = "8.0.1"

RPM_NAME = "python314-astropy-8.0.1-2.1.aarch64.rpm"
RPM_HASH = "70e665fd1055b01c5dcf0f1a986cdab6080f16b2a4dd9ee6081cfe8c9b018e96a35ec556ba03f3e13a1acdc8e46e6cd90a8eeccaed2f3d60fa8bbd24a39260ed"

RPROVIDES:${PN} += "python3.14dist-astropy \
python314-astropy \
python3dist-astropy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libwcs.so.8 \
python-abi \
python314-PyYAML \
python314-astropy-iers-data \
python314-numpy \
python314-packaging \
python314-pyerfa \
update-alternatives"

inherit rpm
