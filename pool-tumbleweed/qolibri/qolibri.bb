SUMMARY = "EPWING Dictionary Viewer"
DESCRIPTION = "qolibri is a dictionary viewer for the proprietary EPWING dictionary format \
(originally developed for electronic pocket dictionaries). Most monolingual \
Japanese dictionaries can only be found in the EPWING format."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "qolibri-2.1.4-1.19.aarch64.rpm"
RPM_HASH = "57c9be74e6ceeb20bd5f4c47411df529d058f9872d871b38b7fd6714dc77131b458f0f253435547a6a034eada6fb394260af4b84089f3bca4455475660de498e"

RPROVIDES:${PN} += "qolibri"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5WebEngineWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libeb.so.16 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
