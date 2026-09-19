SUMMARY = "Plasma widget to view address book contacts"
DESCRIPTION = "This package provides a Plasma widget to view address book contacts."
LICENSE = "GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "merkuro-plasmoid-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "be2d297f01c3d8850f91c5f3d711a9981b4b37d65dfe8a9787a6f8262c6ff91abf3c4d8093f81623589e813596612e61eb3a147d304df3daba7e1872ab71f221"

RPROVIDES:${PN} += "kalendar-plasmoid \
merkuro-plasmoid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libPlasma.so.7 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6 \
merkuro"

inherit rpm
