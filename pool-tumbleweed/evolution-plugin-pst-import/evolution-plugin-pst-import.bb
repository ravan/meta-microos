SUMMARY = "Outlook PST importer plugin for the Evolution groupware suite"
DESCRIPTION = "Adds support to import messages from Outlook PST files."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.60.2"

RPM_NAME = "evolution-plugin-pst-import-3.60.2-1.2.aarch64.rpm"
RPM_HASH = "230ba1e6da7b103e34ea3e5f06ad71fb8a4aa7be31997187f4e82b249a2835f84442fa2883cfadcc64ac47e1c20305798c75c7b9cc90bfee4e69b36f43a7d459"

RPROVIDES:${PN} += "evolution-plugin-pst-import \
liborg-gnome-pst-import.so"

RDEPENDS:${PN} += "evolution \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.5 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libemail-engine.so \
libevolution-mail.so \
libevolution-shell.so \
libevolution-util.so \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libical-glib.so.3 \
libpst.so.4"

inherit rpm
