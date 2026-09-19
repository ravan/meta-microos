SUMMARY = "KQuickImageEditor library"
DESCRIPTION = "KQuickImageEditor is a set of QtQuick components providing basic image editing \
capabilities."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.0.1"

RPM_NAME = "libKQuickImageEditor1-0.7.0.1-1.1.aarch64.rpm"
RPM_HASH = "ae84e22e23299f845b7fb9f380c5cb684c06a2ecc97c3b921cae1d917830836116bd7e44ae4b2977d38f67ce9278e379502981dfcc1be79feb59ab28d11f5be6"

RPROVIDES:${PN} += "libKQuickImageEditor.so.1 \
libKQuickImageEditor1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libhwy.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
