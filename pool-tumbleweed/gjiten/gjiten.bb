SUMMARY = "Japanese Dictionary Browser for GNOME/GTK+"
DESCRIPTION = "Gjiten is a GNOME-based Japanese dictionary program. It uses the \
JMdict/edict word dictionary, KANJIDIC kanji dictionary, and some of \
the xjdic code. Any combination of stroke count, radicals, and search \
key can be used for Kanji lookups. It requires a working X input \
method (such as ibus) for Japanese input."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.1"

RPM_NAME = "gjiten-3.2.1-1.5.aarch64.rpm"
RPM_HASH = "4ad88d2de51231c912f4061160139ad9c385da13497224a3df2062f7f6ef6908b810072d3d362e91281e5b1540f467579200f566756ad729a193caadc568f464"

RPROVIDES:${PN} += "gjiten \
locale-libgnome-ja"

RDEPENDS:${PN} += "edict \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
