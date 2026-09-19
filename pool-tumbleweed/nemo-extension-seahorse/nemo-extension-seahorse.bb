SUMMARY = "OpenPGP encryption/decryption extension for Nemo file manager"
DESCRIPTION = "seahorse nemo is an extension for nemo which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "6.4.0"

RPM_NAME = "nemo-extension-seahorse-6.4.0-6.4.aarch64.rpm"
RPM_HASH = "0bb40ee84e2841f2e8f699db318b301bd6ca938726d87db2699f5c23972eee1accad2585877e82a0171ab29a2d68dcfa3229bdc126455249814cb70785bf69f3"

RPROVIDES:${PN} += "libnemo-seahorse.so \
nemo-extension-seahorse \
nemo-seahorse"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui.so.0 \
libdbus-glib-1.so.2 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libnemo-extension.so.1 \
libnotify.so.4 \
nautilus-extension-seahorse \
nemo"

inherit rpm
