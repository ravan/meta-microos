SUMMARY = "Python module for GNU parted"
DESCRIPTION = "Python module for the parted library.  It is used for manipulating \
partition tables."
LICENSE = "GPL-2.0-or-later"

PV = "3.13.0"

RPM_NAME = "python314-parted-3.13.0-2.7.aarch64.rpm"
RPM_HASH = "5d76d12634b1322d67c0c13bb70e345e6efc9c8f7f5097d11419001d2934a67bfa3e694c7ec0bb22237b46f182ccb489109a98f301b85764c3d38696720a514c"

RPROVIDES:${PN} += "python3.14dist-pyparted \
python314-parted \
python3dist-pyparted"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libparted.so.2 \
parted \
python-abi"

inherit rpm
