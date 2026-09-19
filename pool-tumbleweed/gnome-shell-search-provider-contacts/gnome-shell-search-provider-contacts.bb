SUMMARY = "Contacts Manager for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "The integraded address book for GNOME. \
 \
Among its features are: \
 \
 * Search for and view contacts; \
 * Edit contact details and make new contacts; \
 * Integration with online address books; \
 * Automatic linking of contacts from different online sources. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from contacts."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-shell-search-provider-contacts-50.0-1.3.aarch64.rpm"
RPM_HASH = "944d76b01aefceef7366b5520cf50c9ae16bb5612ae319e2fae23b1db2686f0fbfa42813ba199143d6c0ef01ff57cac5c3aa22f18cf4825204a72b8bb4c91612"

RPROVIDES:${PN} += "gnome-shell-search-provider-contacts"

RDEPENDS:${PN} += "gnome-contacts \
gnome-shell \
ld-linux-aarch64.so.1 \
libc.so.6 \
libedataserver-1.2.so.27 \
libfolks-eds.so.26 \
libfolks.so.26 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
