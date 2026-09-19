SUMMARY = "Python interface for Akonadi"
DESCRIPTION = "This package provides a python interface for Akonadi."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "python3-akonadi-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ca4d491d318c9865e2bb960e9e2ba188662f3e378a6fb7ac406d971b00a200da8e6d3e6301ef7098775bf96bdb4b2589f9207337cfc52f432b9de10c2dcd2463"

RPROVIDES:${PN} += "python3-akonadi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6ItemModels.so.6 \
libKPim6AkonadiCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi \
python3-kf6-kcoreaddons"

inherit rpm
