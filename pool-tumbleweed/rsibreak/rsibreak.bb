SUMMARY = "Repetetive Strain Injury recovery and prevention assistance utility"
DESCRIPTION = "Repetitive Strain Injury is an illness which can occur as a result of \
working with a mouse and keyboard. This utility can be used to remind \
you to take a break now and then."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.0"

RPM_NAME = "rsibreak-0.13.0-1.9.aarch64.rpm"
RPM_HASH = "95edc01ad129f1f1cc123eafe87cd0c019b724d087e3fc8d84341e4c8317655c365cc4ecf47f179c17ad5500c21f2f6b440f483a94ed450889c7d0e0136c59e5"

RPROVIDES:${PN} += "rsibreak"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IdleTime.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
