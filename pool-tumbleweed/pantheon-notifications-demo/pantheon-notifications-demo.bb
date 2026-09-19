SUMMARY = "Pantheon Notification Server -- Demo binary"
DESCRIPTION = "A Gtk notification server for Pantheon desktop. \
 \
This package contains a small demo app to send notifications."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.2"

RPM_NAME = "pantheon-notifications-demo-8.1.2-1.5.aarch64.rpm"
RPM_HASH = "50c0e06448cfd93ea2b4e2e9e4376d159d2e31b7805c111d017ad42146e2d6b50a96bd12924ef38bb10b2c885f492f9f7b97bee67384ec3b2ae00d15d25924b5"

RPROVIDES:${PN} += "pantheon-notifications-demo"

RDEPENDS:${PN} += "libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1"

inherit rpm
