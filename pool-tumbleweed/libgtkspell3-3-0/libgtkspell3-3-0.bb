SUMMARY = "GTK3 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "libgtkspell3-3-0-3.0.10-3.19.aarch64.rpm"
RPM_HASH = "aba51b85dcd337cb06aa3150fce6d137fc5e2bcedf1aaa35fdeaf092b2d96c98358317ff9d2cb7bb70654d8e67a4504728de1fa47669b1202a6107197fe931e4"

RPROVIDES:${PN} += "gtkspell3 \
libgtkspell3-3-0 \
libgtkspell3-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant-2.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
