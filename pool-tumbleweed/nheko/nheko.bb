SUMMARY = "Desktop client for the Matrix protocol"
DESCRIPTION = "The motivation behind the project is to provide a native desktop app \
for Matrix that feels more like a mainstream chat app."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & CC-BY-4.0"

PV = "0.12.1"

RPM_NAME = "nheko-0.12.1-4.14.aarch64.rpm"
RPM_HASH = "cbd2f4277ef3b4b61cc9e3c98d1f1f9274637b20919868afcaa5c9ba63da438d8173ce3c2de738699176a1cd7fd89cafd650b358f1ccdfa5891b35e88189f62c"

RPROVIDES:${PN} += "bundled-blurhash \
bundled-cpp-httplib \
nheko"

RDEPENDS:${PN} += "kf6-kirigami-imports \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcmark.so.0.31.1 \
libfmt.so.12 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstgl-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstsdp-1.0.so.0 \
libgstwebrtc-1.0.so.0 \
libkdsingleapplication-qt6.so.1.2 \
liblmdb-0.9.35.so \
libm.so.6 \
libmatrix-client.so.0.10.1 \
libolm.so.3 \
libqt6keychain.so.1 \
libspdlog.so.1.17 \
libstdc++.so.6 \
qt6-multimedia-imports"

inherit rpm
