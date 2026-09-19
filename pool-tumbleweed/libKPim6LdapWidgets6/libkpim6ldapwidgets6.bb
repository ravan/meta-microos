SUMMARY = "KDE PIM Libraries: LDAP support"
DESCRIPTION = "This package provides LDAP support for KDE PIM applications"
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6LdapWidgets6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "67feda0f9cc15a36f33191c73874c0ba36fdfe989d335c066538f15c299031c39f95d9133dc58634f0a6bb9adcadea63a0dff6f549eb0f007879c5f48be94a9c"

RPROVIDES:${PN} += "libKPim6LdapWidgets.so.6 \
libKPim6LdapWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kldap \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6WidgetsAddons.so.6 \
libKPim6LdapCore.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
