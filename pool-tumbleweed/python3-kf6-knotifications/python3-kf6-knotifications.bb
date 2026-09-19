SUMMARY = "Python interface for kf6-knotifications"
DESCRIPTION = "This package provides a python interface for kf6-knotifications."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-knotifications-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "314af9b669e5b62608e86f853bd9cbc9b1bbfd06c7a9a32fcb79d87de603384d63b36a95d6a9f8f97e69f24c4c461bbbd6a17527a1cb7cf57107d41a5370583f"

RPROVIDES:${PN} += "python3-kf6-knotifications"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Notifications.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm
