SUMMARY = "GNOME Terminal Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Terminal."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.60.0"

RPM_NAME = "gnome-shell-search-provider-gnome-terminal-3.60.0-1.2.noarch.rpm"
RPM_HASH = "765aad5e12b29a616959cb86bd6a080a8446bead3b163b4ecbf05b3fdabfd1e9515605d39df46a7fd27220d1d9429abd257cee0cadf8911ea8d8fc26effad4ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-terminal"

RDEPENDS:${PN} += "gnome-terminal"

inherit rpm
