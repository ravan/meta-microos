SUMMARY = "Python 3 bindings for the libdnf library"
DESCRIPTION = "Python 3 bindings for the libdnf library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "python3-libdnf5-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "5dfccb4d43a52bfab8c65a7fc4c5ff5f14b5dd3e8b44dc50a297ad4d5db1efbec8e5219def3443fa5b1d4779c5c73964e5dc81692d67f69dc697f1060ad6fca3"

RPROVIDES:${PN} += "python3-libdnf5 \
python3.13dist-libdnf5 \
python3dist-libdnf5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi"

inherit rpm
