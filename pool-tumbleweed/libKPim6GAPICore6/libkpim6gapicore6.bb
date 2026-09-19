SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6GAPICore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "db6f211e7c4cde7f2922fbfc6f797c94d61229a407c11844d7785db9ae9b4ce6fd855d716c1f3ff68a90cb262aa89401daa4497405a7e81dbf6b4b6e848c21d9"

RPROVIDES:${PN} += "libKPim6GAPICore.so.6 \
libKPim6GAPICore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Wallet.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libkgapi6 \
libstdc++.so.6 \
sasl2-kdexoauth2"

inherit rpm
