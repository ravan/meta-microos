SUMMARY = "Kerberos 5 ticket monitoring tray applet"
DESCRIPTION = "krb5-auth-dialog is a tray applet that monitors and refreshes your \
Kerberos ticket. It pops up reminders when the ticket is about to \
expire. \
 \
It features ticket autorenewal and supports pkinit."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.alpha1"

RPM_NAME = "krb5-auth-dialog-44.0.alpha1-1.11.aarch64.rpm"
RPM_HASH = "faf340e483a2bc44b7ea9a950d94b4cc2cc5bf2c0fee468cc3bc122b7f07e58e48e7f45d221ba2ac9d91b3e3b313fe4c4f54d139f40f21b524c439b45c8d70e9"

RPROVIDES:${PN} += "krb5-auth-dialog \
libka-plugin-afs.so \
libka-plugin-dummy.so \
libka-plugin-gnomelock.so \
libka-plugin-pam.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libkrb5.so.3"

inherit rpm
