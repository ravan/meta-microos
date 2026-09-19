SUMMARY = "Gammaray libraries"
DESCRIPTION = "Gammaray libraries."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.0"

RPM_NAME = "libgammaray-qt6-3_4_0-3.4.0-1.7.aarch64.rpm"
RPM_HASH = "054d97306e83f33d4d8d49d6831876b16a288043ef85d2439c4c80da383b0270b6fff88e04115b240600c03b1e60674e3a025fc20f99a9e7197d9aa0757d9d68"

RPROVIDES:${PN} += "libgammaray-client.so.3.4.0 \
libgammaray-common-qt6-11-aarch64.so.3.4.0 \
libgammaray-core-qt6-11-aarch64.so.3.4.0 \
libgammaray-kitemmodels-qt6-11-aarch64.so.3.4.0 \
libgammaray-kuserfeedback.so.3.4.0 \
libgammaray-launcher-ui.so.3.4.0 \
libgammaray-launcher.so.3.4.0 \
libgammaray-qt6-3-4-0 \
libgammaray-ui-qt6-11-aarch64.so.3.4.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6SyntaxHighlighting.so.6 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdw.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
