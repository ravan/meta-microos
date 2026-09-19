SUMMARY = "A gettext po file editor for the GNOME desktop"
DESCRIPTION = "Gtranslator is an enhanced gettext PO file editor for the GNOME desktop environment. It handles all forms of gettext PO files and features many comfortable everyday usage features like find and replace functions, auto translation, and translation learning."
LICENSE = "GPL-3.0-or-later"

PV = "50.0+157"

RPM_NAME = "gtranslator-50.0+157-1.2.aarch64.rpm"
RPM_HASH = "8b1f50bd3e56cd9f4ce6328d508ad23b624c819c681b376e7bba835b10eb43757a0b15823846dfa50f446010ba2bcc9b78ae9e488a13a9d137fc5234c72c3480"

RPROVIDES:${PN} += "gtranslator"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
iso-codes \
ld-linux-aarch64.so.1 \
libadwaita-1-0 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgda-sqlite \
libgettextpo.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtksourceview-5.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libspelling-1.so.2 \
libsqlite3.so.0 \
libxml2.so.16"

inherit rpm
