SUMMARY = "Fcitx5 Custom Phrase editor library"
DESCRIPTION = "Fcitx5 Custom Phrase editor library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.1.11"

RPM_NAME = "fcitx5-customphraseeditor6-5.1.11-1.4.aarch64.rpm"
RPM_HASH = "d43627d661a0d7de266dba4892968eac1ab9b4e4b46c09a829181184886283f9de24e144bed4dac2911cfc6019dadefc2f6f107c8788779ed005a667501db2b1"

RPROVIDES:${PN} += "fcitx5-customphraseeditor6 \
libcustomphraseeditor.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libFcitx5Qt6WidgetsAddons.so.2 \
libFcitx5Utils.so.2 \
libIMECore.so.0 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
