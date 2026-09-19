SUMMARY = "Personal Information Manager"
DESCRIPTION = "Kontact combines the individual applications KMail, KAddressBook and \
KOrganizer as views in one window."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kontact-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d479d142ef6e66ee6e9bf4ba8399546bec2d9d9ac95eda8535b5200477aa33de090288713238985c4d47d5072e6fc583e3a80ad90ad5caf5c45797f89cec2504"

RPROVIDES:${PN} += "kontact \
kontact5 \
libkontactprivate.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOGui.so.6 \
libKF6Parts.so.6 \
libKF6Service.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6GrantleeTheme.so.6 \
libKPim6KontactInterface.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
