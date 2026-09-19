SUMMARY = "Monitor your system processes"
DESCRIPTION = "Resources is a simple yet powerful monitor for your system resources and \
processes, written in Rust and using GTK 4 and libadwaita for its GUI."
LICENSE = "GPL-3.0-or-later"

PV = "51.0"

RPM_NAME = "resources-51.0-1.1.aarch64.rpm"
RPM_HASH = "94b7df98c63b341ffccabcf46a3fafafb0cbbc92b7188bf55b7f0f4c7c0ef4f230bad2d51cadd2a4c41ced569cdc226678ac31fe6bae97046b1e8e9b378aef75"

RPROVIDES:${PN} += "resources"

RDEPENDS:${PN} += "dmidecode \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libsoup-3.0.so.0 \
polkit"

inherit rpm
