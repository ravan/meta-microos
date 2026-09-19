SUMMARY = "GTK2 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "libgtkspell0-2.0.16-25.4.aarch64.rpm"
RPM_HASH = "e95100313c72d5dcf411136ee61e996d1458a94f6f1cb2447611f149b4835e5404befea370746d4d175f9416aa1a62311ec37383d2b50cdedd5c9826f3d48833"

RPROVIDES:${PN} += "gtkspell \
libgtkspell.so.0 \
libgtkspell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libenchant.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
