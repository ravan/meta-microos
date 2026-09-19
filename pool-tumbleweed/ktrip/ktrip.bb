SUMMARY = "Public transport assistant targeted towards mobile Linux and Android"
DESCRIPTION = "KTrip is a public transport assistant targeted towards mobile Linux and \
Android. It allows to query journeys for a wide range of countries/public \
transport providers by leveraging KPublicTransport."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ktrip-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1461ada0c031ae883c150eaf7e3e14978d83d792c365c5462bec9b599904564d85b1efc18b18aa3a60ae7603aa7c0a643578b651cad77215fee5782161523a50"

RPROVIDES:${PN} += "ktrip"

RDEPENDS:${PN} += "kf6-breeze-icons \
kf6-kirigami-imports \
kf6-kitemmodels-imports \
kirigami-addons6 \
kpublictransport-imports \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKPublicTransport.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
