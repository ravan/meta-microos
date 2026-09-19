SUMMARY = "Module to Remap, mask, renumber, and in-place transpose numpy arrays"
DESCRIPTION = "A module to remap, mask, renumber, and in-place transpose numpy arrays."
LICENSE = "LGPL-3.0-only"

PV = "1.14.2"

RPM_NAME = "python314-fastremap-1.14.2-1.11.aarch64.rpm"
RPM_HASH = "d1423e603efa262c9febd64a56bcaf1e8a09c279490d5209b98136158a11647076937a9dfd6dfaeaee4114003c96bf0fa4cb484f5c0763fda9d40d4777e93cb7"

RPROVIDES:${PN} += "python3.14dist-fastremap \
python314-fastremap \
python3dist-fastremap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
