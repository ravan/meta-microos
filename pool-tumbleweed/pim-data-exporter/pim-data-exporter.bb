SUMMARY = "Data exporter for KDE PIM applications"
DESCRIPTION = "This package contains utlities needed by KDE PIM applications to export data \
for backup and archival."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "pim-data-exporter-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "61fb5bf9a56fa026ca4c364037bae0e73e75526db60332b7257f4ca7ae55086467ee034f86cc33760ab4ea67c24c2ff66991f1dd3a56adda90470618e279f699"

RPROVIDES:${PN} += "libpimdataexporterprivate.so.6 \
pim-data-exporter"

RDEPENDS:${PN} += "/sbin/ldconfig \
kontact \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6CalendarCore.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemViews.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOFileWidgets.so.6 \
libKF6KIOGui.so.6 \
libKF6Mime.so.6 \
libKF6StatusNotifierItem.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6MailCommon.so.6 \
libKPim6MailTransport.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
