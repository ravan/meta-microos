SUMMARY = "GNOME Characters -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Characters."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-shell-search-provider-gnome-characters-50.0-2.1.noarch.rpm"
RPM_HASH = "a8d0ee2800fd2b1cfc86b50edd6fe280ef820414989634ddefaf5bdbf037eb579d5165a3be40d5290417cd36fb338a94064a8a9630464a5d6f4e0d16f283224f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-characters"

RDEPENDS:${PN} += "gnome-characters"

inherit rpm
