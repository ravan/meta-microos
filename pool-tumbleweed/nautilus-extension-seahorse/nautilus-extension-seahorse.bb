SUMMARY = "Extension for nautilus which allows encryption and decryption of files"
DESCRIPTION = "Seahorse nautilus is an extension for nautilus which allows encryption \
and decryption of OpenPGP files using GnuPG."
LICENSE = "GPL-2.0-or-later"

PV = "3.11.92+95"

RPM_NAME = "nautilus-extension-seahorse-3.11.92+95-2.6.aarch64.rpm"
RPM_HASH = "43fc90b163ba2ac9c0ae76d553b7246529812a56b1aeb0a179cec7c564fec27c272c046ea26f7e9034d885ea135c8d749aa0772202df90c35b6ab107e519a110"

RPROVIDES:${PN} += "libnautilus-seahorse.so \
nautilus-extension-seahorse \
seahorse-nautilus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcryptui.so.0 \
libdbus-glib-1.so.2 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libgtk-3.so.0 \
libnautilus-extension.so.4"

inherit rpm
