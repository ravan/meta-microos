SUMMARY = "A Personal Finance Manager by KDE"
DESCRIPTION = "KMyMoney is a Personal Finance Manager by KDE. It operates \
similar to Quicken, supports various account types, categorization \
of expenses, multiple currencies, online banking support via QIF, \
OFX and HBCI, budgeting and a rich set of reports."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.2.2"

RPM_NAME = "kmymoney-5.2.2-1.7.aarch64.rpm"
RPM_HASH = "64f5f5f372691dc87a7d85c8a742492a304820dd8d00b6f2c8fe0a45986887441901dc984b66dd1856fbf23edb487fa37f49d02beed5c43da39f9dd4009c6cb8"

RPROVIDES:${PN} += "kmymoney \
kmymoney-doc \
kmymoney5 \
libkmm-base-dialogs.so.5 \
libkmm-base-widgets.so.5 \
libkmm-codec.so.5 \
libkmm-csvimportercore.so.5 \
libkmm-extended-dialogs.so.5 \
libkmm-gpgfile.so.5 \
libkmm-icons.so.5 \
libkmm-keychain.so.5 \
libkmm-menuactionexchanger.so.5 \
libkmm-menus.so.5 \
libkmm-models.so.5 \
libkmm-mymoney.so.5 \
libkmm-payeeidentifier.so.5 \
libkmm-plugin.so.5 \
libkmm-printer.so.5 \
libkmm-selections.so.5 \
libkmm-settings.so.5 \
libkmm-templates.so.5 \
libkmm-webconnect.so.5 \
libkmm-widgets.so.5 \
libkmm-wizard.so.5 \
libkmm-yesno.so.5 \
libonlinetask-interfaces.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKChart6.so.3 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6Holidays.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6ItemViews.so.6 \
libKF6JobWidgets.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6KIOCore.so.6 \
libKF6KIOGui.so.6 \
libKF6KIOWidgets.so.6 \
libKF6SonnetUi.so.6 \
libKF6TextWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6IdentityManagementCore.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libalkimia6.so.8 \
libaqbanking.so.44 \
libc.so.6 \
libgcc-s.so.1 \
libgmp.so.10 \
libgpgmepp.so.7 \
libgwengui-cpp.so.79 \
libgwengui-qt6.so.79 \
libgwenhywfar.so.79 \
libical.so.3 \
libm.so.6 \
libofx.so.7 \
libpython3.13.so.1.0 \
libqt6keychain.so.1 \
libsqlcipher.so.0 \
libstdc++.so.6 \
qt6-sql-sqlite"

inherit rpm
