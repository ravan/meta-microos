SUMMARY = "Task Manager"
DESCRIPTION = "Synced tasks and reminders for the Pantheon Desktop."
LICENSE = "GPL-3.0-or-later"

PV = "6.3.3"

RPM_NAME = "pantheon-tasks-6.3.3-2.3.aarch64.rpm"
RPM_HASH = "66c87e6b2e2f65ca15c14619b386bc2f8d1979041195a0ca6befa6a583e9af0c5867e5b872ee400fa521a9f01b5dcb95b633b7d83f812ec2712195f4f1cf139e"

RPROVIDES:${PN} += "elementary-tasks \
pantheon-tasks"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libecal-2.0.so.3 \
libedataserver-1.2.so.27 \
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
libjson-glib-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1"

inherit rpm
