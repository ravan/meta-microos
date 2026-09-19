SUMMARY = "Note editor for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "It is the same note taking application, including most of the add-ins (more are \
to come). Synchronization support is being worked on. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from documents."
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "gnome-shell-search-provider-gnote-50.2-1.1.noarch.rpm"
RPM_HASH = "c6b43f43d48f6e9cdb76037a4af8cb7695f8f2de282f40ead419b2b058d636bbb69b7d8e8c6d561d7e59176cd278e677b1a5eb1b19801b6eea25e97c35c2481d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnote"

RDEPENDS:${PN} += "gnome-shell \
gnote"

inherit rpm
