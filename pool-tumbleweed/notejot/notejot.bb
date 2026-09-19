SUMMARY = "A Sticky Note App"
DESCRIPTION = "A sticky notes application for any type of short term notes \
or ideas."
LICENSE = "GPL-3.0-only"

PV = "3.5.1"

RPM_NAME = "notejot-3.5.1-1.7.aarch64.rpm"
RPM_HASH = "46f3abc37658097639b48322bc32bc5a5be432ba8bbe00be4bbd19440ea89312ff728abdfb14c1eb29c93efe48315e8270e8913dffe7ce6fe01a1089e72a7875"

RPROVIDES:${PN} += "notejot"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0"

inherit rpm
