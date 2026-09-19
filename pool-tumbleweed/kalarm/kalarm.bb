SUMMARY = "Personal Alarm Scheduler"
DESCRIPTION = "Personal alarm message, command and email scheduler by KDE."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kalarm-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "9d7eb10a4eea2c4cc3a5dfd88f1335b59975603bac7aed5466d032ebdd101b2ebdf4579c22edbfc64bad35d9ef66d8f89e8d020f1187421c2ec3dc822f21a1e9"

RPROVIDES:${PN} += "config-kalarm \
kalarm \
kalarm5 \
libkalarmcalendar.so.6 \
libkalarmplugin.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6AuthCore.so.6 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6GlobalAccel.so.6 \
libKF6GuiAddons.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemModels.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextEditTextToSpeech.so.1 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementWidgets.so.6 \
libKPim6MailTransport.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmpv.so.2 \
libstdc++.so.6 \
libvlc.so.5"

inherit rpm
