SUMMARY = "Graphical disk usage viewer"
DESCRIPTION = "Filelight creates an interactive visualization of disk usage \
and the sizes of files and directories on the system."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "filelight-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "29b7a03f1c40e41d4c336f9a19e5ae32d638299d9fa73c1273cb7746eb6e4110086befba24c004b5fee8a1effc9f692e12c26b7aee02f0e5f298e8b4845278cf"

RPROVIDES:${PN} += "filelight \
filelight5"

RDEPENDS:${PN} += "kf6-qqc2-desktop-style \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6I18nQml.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
