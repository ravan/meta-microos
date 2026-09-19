SUMMARY = "Kirigami TV guide"
DESCRIPTION = "Telly Skout is a convergent Kirigami TV guide. It shows the TV program for your \
favorite channels from TV Spielfilm or an XMLTV file."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "telly-skout-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "97f0d33bef5c92e82ee0b688f99f5d554334d5989ffc3a7fbcabc73df4eb01db31d642b251aa7202451df438e9f30acd85a8ac11b764225d7cb0c776bdd01a23"

RPROVIDES:${PN} += "telly-skout"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-sql-sqlite"

inherit rpm
