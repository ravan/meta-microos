SUMMARY = "Python Bindings for OpenColorIO"
DESCRIPTION = "This package contains python bindings for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.5.2"

RPM_NAME = "python3-OpenColorIO-2.5.2-1.3.aarch64.rpm"
RPM_HASH = "8218fb184f7aa76913df2d51e4de06228b96ffb007bd3e4daf3287c975b8e07eeda51bb4ffe19b150009b14ee03253b01e1b2bb6c85876d86096f97c9c34fe0b"

RPROVIDES:${PN} += "python-OpenColorIO \
python3-OpenColorIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenColorIO.so.2.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
