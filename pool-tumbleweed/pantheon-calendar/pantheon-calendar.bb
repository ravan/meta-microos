SUMMARY = "Maya Calendar for the Pantheon Desktop"
DESCRIPTION = "A slim, lightweight Granite calendar app written in Vala, designed for \
the Pantheon Desktop where it is known simply as Calendar. \
 \
Also looks and works great on other GTK desktops."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-calendar-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "b5bfc18d7e1d6914d6255149e43a76c48a39c5277b29862ca5a0d2377d1bc5b5341f03387a6aea8e06d26585049cc2c92bf064697669a3f1c20ff44156da9812"

RPROVIDES:${PN} += "elementary-calendar \
pantheon-calendar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
libelementary-calendar.so.0 \
libfolks.so.26 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgeoclue-2.so.0 \
libgeocode-glib-2.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
libical-glib.so.3 \
libportal-gtk3.so.1 \
libportal.so.1"

inherit rpm
