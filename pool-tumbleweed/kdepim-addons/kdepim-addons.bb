SUMMARY = "Addons for KDE PIM applications"
DESCRIPTION = "Addons for KDE PIM applications, such as extensions for KMail, additional \
themes, and plugins providing extra or advanced functionality."
LICENSE = "GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kdepim-addons-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "755fe9d86e85bc91070dcfda61417d66b8186c42d3f7d32e00542b2f4b4fbe02f6f9d22d3cc13c46bed12eabc964d009e0a9abbf86f401e6b7903b141b90daff"

RPROVIDES:${PN} += "kdepim-addons \
libKPim6AutoGenerateText.so.6 \
libadblockplugin.so.6 \
libakonadidatasetools.so.6 \
libdkimverifyconfigure.so.6 \
libexpireaccounttrashfolderconfig.so.6 \
libfolderconfiguresettings.so.6 \
libkaddressbookmergelibprivate.so.6 \
libkmailconfirmbeforedeleting.so.6 \
libkmailmarkdown.so.6 \
libkmailquicktextpluginprivate.so.6 \
libopenurlwithconfigure.so.6 \
libpimcalendarsplugin.so \
libshorturlpluginprivate.so.6 \
qt6qmlimport-org.kde.plasma.PimCalendars \
qt6qmlimport-org.kde.plasma.PimCalendars.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libKF6CalendarCore.so.6 \
libKF6CalendarEvents.so.6 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6Mime.so.6 \
libKF6Prison.so.6 \
libKF6Service.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6TextAutoGenerateText.so.1 \
libKF6TextCustomEditor.so.1 \
libKF6TextGrammarCheck.so.1 \
libKF6TextTemplate.so.6 \
libKF6TextTranslator.so.1 \
libKF6TextUtils.so.1 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AddressbookImportExport.so.6 \
libKPim6AkonadiCalendar.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6CalendarSupport.so.6 \
libKPim6CalendarUtils.so.6 \
libKPim6GrantleeTheme.so.6 \
libKPim6Gravatar.so.6 \
libKPim6IMAP.so.6 \
libKPim6IdentityManagementCore.so.6 \
libKPim6ImportWizard.so.6 \
libKPim6IncidenceEditor.so.6 \
libKPim6Itinerary.so.6 \
libKPim6KSieveCore.so.6 \
libKPim6KSieveUi.so.6 \
libKPim6LdapWidgets.so.6 \
libKPim6Libkleo.so.6 \
libKPim6MailCommon.so.6 \
libKPim6MailImporter.so.6 \
libKPim6MailTransport.so.6 \
libKPim6MessageComposer.so.6 \
libKPim6MessageCore.so.6 \
libKPim6MessageViewer.so.6 \
libKPim6MimeTreeParser.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonActivities.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libKPim6PkPass.so.6 \
libKPim6TemplateParser.so.6 \
libKPim6TextEdit.so.6 \
libKPim6Tnef.so.6 \
libKPim6WebEngineViewer.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgpgmepp.so.7 \
libmarkdown.so.3 \
libqgpgmeqt6.so.15 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-org.kde.kcmutils \
qt6qmlimport-org.kde.kirigami \
qt6qmlimport-org.kde.kirigamiaddons.delegates \
qt6qmlimport-org.kde.kitemmodels"

inherit rpm
