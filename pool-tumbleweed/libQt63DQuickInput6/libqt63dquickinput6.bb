SUMMARY = "Qt 6 3DQuickInput library"
DESCRIPTION = "The Qt 6 3DQuickInput library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt63DQuickInput6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d2850b341d29aa311bc50b19aeb2a0c305f25595ef14158b990165c3ceeb8968ddb71857cc6fb4d30de8b75cbc2d50e7ed13962c38ff7360436ea8934806989e"

RPROVIDES:${PN} += "libQt63DQuickInput.so.6 \
libQt63DQuickInput6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt63DCore.so.6 \
libQt63DInput.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
