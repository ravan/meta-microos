SUMMARY = "Clock gadget for the Pantheon DE"
DESCRIPTION = "A clock application that is designed to fit perfectly into \
Pantheon's design scheme."
LICENSE = "GPL-3.0-only"

PV = "3.1.1"

RPM_NAME = "hourglass-3.1.1-1.4.aarch64.rpm"
RPM_HASH = "16241f980e84e582ba2e41df9f38a1c8c59e992c5b9805b26208a4f7b0df37af7196703a9bd6b2deb0ee56ff6911df05adef878450b6663b141592adb9199184"

RPROVIDES:${PN} += "hourglass"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libportal-gtk4.so.1 \
libportal.so.1"

inherit rpm
