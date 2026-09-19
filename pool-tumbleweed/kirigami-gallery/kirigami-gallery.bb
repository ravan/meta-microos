SUMMARY = "Gallery application built using Kirigami"
DESCRIPTION = "Example application which uses all features from kirigami, \
including links to the sourcecode, tips on how to use the \
components and links to the corresponding HIG pages and \
code examples on cgit"
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kirigami-gallery-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4fa14d7336290a83cb1adb763c34cb1dbe7af87d2e253c8054f68c664a1e651dd53db31c04b3a98acc43f4a703d967a2b15f5402a10776c27d0da15f0e2cd543"

RPROVIDES:${PN} += "kirigami-gallery"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kf6-kitemmodels-imports \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports"

inherit rpm
