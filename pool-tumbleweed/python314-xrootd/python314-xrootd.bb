SUMMARY = "Python bindings for xrootd"
DESCRIPTION = "This package provides python3 bindings for xrootd."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "python314-xrootd-5.9.0-1.5.aarch64.rpm"
RPM_HASH = "34e830d095e057628db1f7bea2d642f16142d37bef1512cbd14dc14d93e8ea9edf5c569b763574c46dd54b13cb7b09e9fd9376629614e84f4c425f99e77706a3"

RPROVIDES:${PN} += "python3.14dist-xrootd \
python314-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "libXrdCl.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
