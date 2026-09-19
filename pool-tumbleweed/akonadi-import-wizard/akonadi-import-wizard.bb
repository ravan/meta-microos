SUMMARY = "Assistant to import PIM data"
DESCRIPTION = "Assistant to import PIM data from other applications into Akonadi for use in \
KDE PIM applications."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-import-wizard-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "22b943621b5547c2551a80813a4926b9a1d1c2afcc35f4160451f733a1df12450575f1363fe3fba18f182b805f53d2c222f925bd036ca025fc164f2182b0f6f0"

RPROVIDES:${PN} += "akonadi-import-wizard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6DBusAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6ImportWizard.so.6 \
libKPim6MailCommon.so.6 \
libKPim6MailImporter.so.6 \
libKPim6MailImporterAkonadi.so.6 \
libKPim6MailTransport.so.6 \
libKPim6MessageViewer.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
