SUMMARY = "Qt 6 LabsSharedImage library"
DESCRIPTION = "The Qt 6 LabsSharedImage library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsSharedImage6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "857e9fbb1c69657b83e1c7401bbcebf45f0bfb560272a45e9c0e98e9060c25a0981a69c69c72278eb33d568dfe69a34174d007cd0815707b280a84df458388f8"

RPROVIDES:${PN} += "libQt6LabsSharedImage.so.6 \
libQt6LabsSharedImage6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
