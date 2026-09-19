SUMMARY = "GNOME Clocks -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Clocks."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-shell-search-provider-gnome-clocks-50.0-1.3.noarch.rpm"
RPM_HASH = "788d87fb528b2feaaa9a5907bbcd7c6aef6eb77d7b5b304c73339e22e4fc97691d337657e1d243fb419e959db74798dd39163e137f7a8a5f6dd8ab0a2e3c3539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-clocks"

RDEPENDS:${PN} += "gnome-clocks"

inherit rpm
