SUMMARY = "Akonadi resources for PIM applications"
DESCRIPTION = "This package contains the Akonadi resources, agents and plugins needed to \
use PIM applications."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdepim-runtime-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "2ed0546946505ac9032a91342641d106935dfc05e0329efdd299fc2111ea710bdfb9140a417a438efa5eab34cdcf4c319368e615c41850939f117f95696bbaeb"

RPROVIDES:${PN} += "kdepim-runtime \
kio-pimlibs \
libakonadi-filestore.so.6 \
libakonadi-singlefileresource-widget.so.6 \
libakonadi-singlefileresource.so.6 \
libfolderarchivesettings.so.6 \
libkmindexreader.so.6 \
libmaildir.so.6 \
libnewmailnotifier.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi \
akonadi-plugin-calendar \
akonadi-plugin-contacts \
akonadi-plugin-mime \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6DAV.so.6 \
libKF6I18n.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6Notifications.so.6 \
libKF6NotifyConfig.so.6 \
libKF6Service.so.6 \
libKF6TextCustomEditor.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6WindowSystem.so.6 \
libKPim6AkonadiAgentBase.so.6 \
libKPim6AkonadiAgentWidgetBase.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiCalendarCore.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6GAPICalendar.so.6 \
libKPim6GAPICore.so.6 \
libKPim6GAPIPeople.so.6 \
libKPim6GAPITasks.so.6 \
libKPim6IMAP.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementWidgets.so.6 \
libKPim6LdapWidgets.so.6 \
libKPim6MailTransport.so.6 \
libKPim6Mbox.so.6 \
libKPim6PimCommonActivities.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6TextToSpeech.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libetebase.so.0 \
libgcc-s.so.1 \
libqca-qt6.so.2 \
libqt6keychain.so.1 \
libsasl2.so.3 \
libstdc++.so.6"

inherit rpm
