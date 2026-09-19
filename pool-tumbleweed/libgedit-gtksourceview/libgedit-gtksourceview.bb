SUMMARY = "Source code editing widget"
DESCRIPTION = "libgedit-gtksourceview is a library that extends GtkTextView, the standard GTK \
widget for multiline text editing. This library adds support for syntax \
highlighting, undo/redo, file loading and saving, search and replace, a \
completion system, printing, displaying line numbers, and other features typical \
of a source code editor."
LICENSE = "LGPL-2.1-or-later"

PV = "299.7.1"

RPM_NAME = "libgedit-gtksourceview-299.7.1-1.1.aarch64.rpm"
RPM_HASH = "26eb2f58efec5ad2198d1e9eb7b6ee49c208c8f6f20a0111b3273850147c7a39b4399b4480cab34fdb38b51584cefa19fc4e23f8aa446eb6b0a128cbd195f440"

RPROVIDES:${PN} += "libgedit-gtksourceview"

RDEPENDS:${PN} += ""

inherit rpm
