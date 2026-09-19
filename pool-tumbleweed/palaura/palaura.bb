SUMMARY = "A dictionary with word definitions"
DESCRIPTION = "palaura is a dictionary application featuring word definitions. \
It uses the Oxford Dictionaries API for lookups."
LICENSE = "GPL-3.0-or-later"

PV = "1.5.1"

RPM_NAME = "palaura-1.5.1-2.8.aarch64.rpm"
RPM_HASH = "0731f9d58e49f7ec1fa5cda43300cbff7a47e97c981664e72646a841b050076ebda051a2416c16238bdc288913014b4648df3a042cc186e04a144bd26e0a8652"

RPROVIDES:${PN} += "palaura"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-3.0.so.1 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1"

inherit rpm
