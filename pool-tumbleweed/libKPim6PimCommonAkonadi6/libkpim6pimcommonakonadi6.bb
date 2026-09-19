SUMMARY = "The PimCommon Akonadi Library"
DESCRIPTION = "The PimCommon Akonadi library"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6PimCommonAkonadi6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "a52ec42e038e3e331273c496144ed40d863e68ef41a53f0ebfddcb05ecc274358e41b5ec243f9b3c0ed155980f9ffba68bf488dd8e3ee6ebc6a7a6d81d0fe1fd"

RPROVIDES:${PN} += "libKPim6PimCommonAkonadi.so.6 \
libKPim6PimCommonAkonadi6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ColorScheme.so.6 \
libKF6Completion.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6ItemModels.so.6 \
libKF6KCMUtils.so.6 \
libKF6KIOCore.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiSearchPIM.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6IMAP.so.6 \
libKPim6LdapCore.so.6 \
libKPim6Libkdepim.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
pimcommon"

inherit rpm
