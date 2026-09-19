SUMMARY = "KDE PIM Libraries: Identity Management - core library"
DESCRIPTION = "This package provides the core library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6IdentityManagementCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "174609435c7a90b0cb335c46c5bb85483264edff6c1d2753dcc43689a860a2c8d02d380f7fbc9ec755311afea5c58ba1f39b10aef28188c8988b919322eb7469"

RPROVIDES:${PN} += "libKPim6IdentityManagementCore.so.6 \
libKPim6IdentityManagementCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kidentitymanagement \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
