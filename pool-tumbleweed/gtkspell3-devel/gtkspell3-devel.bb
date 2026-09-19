SUMMARY = "GTK3 Spell Checker Interface Library -- Development Files"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.10"

RPM_NAME = "gtkspell3-devel-3.0.10-3.19.aarch64.rpm"
RPM_HASH = "a9da00978074deacd965a4639c45f1f94edae3b9715822bb421e7b226a6cfc2eb6c2a38a72f7ffa955e5c38a0c8fb1f303f44f7efcec92a9499a0accdd8975c3"

RPROVIDES:${PN} += "gtkspell3-devel \
pkgconfig-gtkspell3-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkspell3-3-0 \
pkgconfig-enchant-2 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-GtkSpell-3-0"

inherit rpm
