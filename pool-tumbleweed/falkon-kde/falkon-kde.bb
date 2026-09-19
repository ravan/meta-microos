SUMMARY = "Plugin for tighter integration of KDE technologies"
DESCRIPTION = "Plugin for the Falkon browser that allows tighter integration of KDE technologies, \
such as storing passwords in KWallet."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "falkon-kde-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4848c93be666e5bffed35276b3462a5654c8272af0292e385aca2409f68b95c20d661d03221eab8b43b02490aa4e2a34682023be4a7e05be027423995dc14eeb"

RPROVIDES:${PN} += "falkon-kde \
falkon-kwallet \
qupzilla-kwallet"

RDEPENDS:${PN} += "falkon \
ld-linux-aarch64.so.1 \
libFalkonPrivate.so.3 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6JobWidgets.so.6 \
libKF6KIOCore.so.6 \
libKF6Purpose.so.6 \
libKF6PurposeWidgets.so.6 \
libKF6Wallet.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
