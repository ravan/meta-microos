SUMMARY = "GTK2 Spell Checker Interface Library"
DESCRIPTION = "GtkSpell provides MSWord-style and MacOSX-style highlighting of \
misspelled words in a GtkTextView widget. Right-clicking a misspelled \
word opens a menu of suggested replacements."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "gtkspell-doc-2.0.16-25.4.aarch64.rpm"
RPM_HASH = "f0e1fad8710d1d4131608ab1c83423882e7d2cdb43b0cab2e75aaaa4c1e8c7b6ae433d3332d832d6c048cc3efbd7d9eafe93407cbefb33e84543a029699dc958"

RPROVIDES:${PN} += "gtkspell-doc"

RDEPENDS:${PN} += "libgtkspell0"

inherit rpm
