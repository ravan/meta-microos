SUMMARY = "Qt 6 MultimediaQuick library"
DESCRIPTION = "The Qt 6 MultimediaQuick library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6MultimediaQuick6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "de9757670e1ed2ca14dd3eafe7091617a5ecb2a4378f5362c54d88510b679dc22088aebef6b50a0f1060d37e0ce72ee1b7a77ddfd4e58e651ab0c9f25a05f981"

RPROVIDES:${PN} += "libQt6MultimediaQuick.so.6 \
libQt6MultimediaQuick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
