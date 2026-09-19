SUMMARY = "Qt 6 LabsSettings library"
DESCRIPTION = "The Qt 6 LabsSettings library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsSettings6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "640edeab984571d628a7f15614305181319a7f75e71d6d454c450f5e0814dfd7da6265f95de3b741d1ecd46a41224d0191ea141836838a61d4938f82d4221b31"

RPROVIDES:${PN} += "libQt6LabsSettings.so.6 \
libQt6LabsSettings6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
