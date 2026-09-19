SUMMARY = "Python 3 bindings for the createrepo_c library"
DESCRIPTION = "The Python 3 bindings for the createrepo_c library."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.3"

RPM_NAME = "python3-createrepo_c-1.2.3-1.4.aarch64.rpm"
RPM_HASH = "d07feb5d878b55fe15fcbff42604b05d7876a03bfce5941d67a73e5844d742566b4a3a74212eae67ad9ca947a1ac6da49ed9eb4c3893ff511455acb90b47b1d6"

RPROVIDES:${PN} += "python3-createrepo-c \
python3.13dist-createrepo-c \
python3dist-createrepo-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcreaterepo-c.so.1 \
libcreaterepo-c1 \
libglib-2.0.so.0 \
libpython3.13.so.1.0 \
python-abi"

inherit rpm
