SUMMARY = "Contacts Manager for GNOME"
DESCRIPTION = "The integraded address book for GNOME. \
 \
Among its features are: \
 \
 * Search for and view contacts; \
 * Edit contact details and make new contacts; \
 * Integration with online address books; \
 * Automatic linking of contacts from different online sources."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-contacts-50.0-1.3.aarch64.rpm"
RPM_HASH = "90e2d67961b36728a44d3b9cac9fea41874d8e49d26948e273018fdfe583a5516e7a3315868cb573d6a46573cc3aeb47fc6d56ff328125225b0461fa7c0534d9"

RPROVIDES:${PN} += "gnome-contacts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libebook-contacts-1.2.so.5 \
libedataserver-1.2.so.27 \
libfolks-eds.so.26 \
libfolks.so.26 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libglycin-gtk4-2.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libpango-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libqrencode.so.4"

inherit rpm
