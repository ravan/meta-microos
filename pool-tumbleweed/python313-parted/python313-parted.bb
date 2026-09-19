SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.13.0"

RPM_NAME = "python313-parted-3.13.0-2.7.aarch64.rpm"
RPM_HASH = "615249e8c59024a80f10806c3ddd6d5fc11e79c3163dfed32e63962ea0d0ceb898d27f75a681e9a17a847740c54bc086638fb0cdadb5f2e20e94d4c58e71d7aa"

RPROVIDES:${PN} += "python3-parted \
python3.13dist-pyparted \
python313-parted \
python3dist-pyparted"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
parted \
python-abi"

inherit rpm
