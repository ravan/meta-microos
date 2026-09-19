SUMMARY = "Weather application for Plasma"
DESCRIPTION = "A convergent weather application for Plasma. Has flat and dynamic/animated \
views for showing forecasts and other information."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kweather-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "6758ae0af4b4b64594eab972f50885336ee49b9ae399905d96f0ca92c490d13f4d4d42aa5bf2f5f2804fbe9e3c1a19028e5ebed5806a9e75b5313968ef6ace18"

RPROVIDES:${PN} += "kweather"

RDEPENDS:${PN} += "kf6-kholidays-imports \
kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6Runner.so.6 \
libKWeatherCore.so.6 \
libPlasma.so.7 \
libQt6Charts.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
qt6-charts-imports"

inherit rpm
