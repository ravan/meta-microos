SUMMARY = "Qt 6 MultimediaWidgets library"
DESCRIPTION = "The Qt 6 MultimediaWidgets library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6MultimediaWidgets6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "1ef721b3a1ee7e69fabb4b65e5c28b81cf6d6db3ffd0fe03e1a433ec3aa0d19cfe2adee19307a6fd8e555e22d397777c63117ed14f92305760eed56ed10f9b89"

RPROVIDES:${PN} += "libQt6MultimediaWidgets.so.6 \
libQt6MultimediaWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
