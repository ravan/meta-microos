SUMMARY = "Python bindings for kf6-kcoreaddons"
DESCRIPTION = "This package provides Python bindings for kf6-kcoreaddons."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kcoreaddons-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "e54f5e4a84f436618d03a0947f34c27e05f5e191c6cbd58157c46497a3880b28170dca03b4890203d0551700e256432ad0460f240c6cf00ca25ae252509751dc"

RPROVIDES:${PN} += "python3-kf6-kcoreaddons"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
