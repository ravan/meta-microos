SUMMARY = "Extensible Text Editor for the Pantheon Desktop"
DESCRIPTION = "pantheon-code is a Granite-based text editor. It \
auto-saves files, and can remembers tabs and cursor positions. You \
can install extensions to turn elementary-code into a full-blown IDE, as \
well as tweak the behaviour and interface to your liking. It has \
highlighting for many programming, scripting and markup languages."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.2"

RPM_NAME = "pantheon-code-8.3.2-1.1.aarch64.rpm"
RPM_HASH = "f4be2ceec21a718e1b4b136b1639ca5c7ccfd208e30dfc34a975fc76ba160954227dafb2329f943acef157a70f54024c057540d09dbe8d0d2f03ec06a3c6f5a0"

RPROVIDES:${PN} += "elementary-code \
pantheon-code"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libgit2-glib-1.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpeas-2.so.0 \
libvala-0.56.so.0 \
libvte-2.91.so.0"

inherit rpm
