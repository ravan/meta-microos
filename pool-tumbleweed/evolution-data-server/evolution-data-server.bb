SUMMARY = "Evolution Data Server"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "evolution-data-server-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "63545ce65a3368ea601e57b45d90440960a0683aa16aee79a62360cb5eac2c6c8b2991d6e3022a452fa70047089de8a9707b09a92c9927b23998a2a974a6a70f"

RPROVIDES:${PN} += "evolution-data-server \
libcamelimapx.so \
libcamellocal.so \
libcamelnntp.so \
libcamelpop3.so \
libcamelsendmail.so \
libcamelsmtp.so \
libebookbackendcarddav.so \
libebookbackendfile.so \
libebookbackendldap.so \
libecalbackendcaldav.so \
libecalbackendcontacts.so \
libecalbackendfile.so \
libecalbackendgtasks.so \
libecalbackendhttp.so \
libecalbackendweather.so \
libecalbackendwebdavnotes.so \
libedbus-private.so"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcamel-1.2.so.67 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libdb-4.8.so \
libebackend-1.2.so.11 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.5 \
libecal-2.0.so.3 \
libedata-book-1.2.so.27 \
libedata-cal-2.0.so.2 \
libedataserver-1.2.so.27 \
libedataserverui-1.2.so.4 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgweather-4.so.0 \
libical-glib.so.3 \
libical.so.3 \
libjson-glib-1.0.so.0 \
liblber.so.2 \
libldap.so.2 \
libpango-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16 \
mozilla-nss"

inherit rpm
