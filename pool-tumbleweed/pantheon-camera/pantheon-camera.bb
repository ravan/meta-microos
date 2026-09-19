SUMMARY = "A camera application"
DESCRIPTION = "Camera application designed for the Pantheon desktop"
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-camera-8.0.2-1.4.aarch64.rpm"
RPM_HASH = "7172b9b57919b507827e29f25b8fa0009e933b5a0510d35ab4c33ce6858b10f070d2bede0e741aa08776a36a55d5365a1eb38f74463cfa26b823d7c264027de4"

RPROVIDES:${PN} += "elementary-camera \
pantheon-camera"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
