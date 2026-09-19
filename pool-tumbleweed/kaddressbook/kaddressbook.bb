SUMMARY = "Address book application to manage contacts"
DESCRIPTION = "KAddressbook is an application by KDE to manage contacts."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "kaddressbook-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4e8aa35d60d19030623d5402d24333047790f6579e7d10d00c63d1d4c232b161636992d5a2589ec5be9e054e8c91f9802967bcb6e74e549f829b86c4e339d978"

RPROVIDES:${PN} += "kaddressbook \
kaddressbook5 \
libkaddressbookprivate.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kdepim-runtime \
ld-linux-aarch64.so.1 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemModels.so.6 \
libKF6KCMUtils.so.6 \
libKF6KCMUtilsCore.so.6 \
libKF6Parts.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKF6UserFeedbackCore.so.6 \
libKF6UserFeedbackWidgets.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AddressbookImportExport.so.6 \
libKPim6AddressbookImportExport6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiSearchDebug.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6GrantleeTheme.so.6 \
libKPim6KontactInterface.so.6 \
libKPim6LdapCore.so.6 \
libKPim6LdapWidgets.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6PimCommon.so.6 \
libKPim6PimCommonActivities.so.6 \
libKPim6PimCommonAkonadi.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
