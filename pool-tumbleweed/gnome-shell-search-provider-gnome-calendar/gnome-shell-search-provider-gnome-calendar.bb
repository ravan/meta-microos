SUMMARY = "GNOME Shell search provider to return results from the GNOME Calendar"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Calendar."
LICENSE = "GPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-shell-search-provider-gnome-calendar-50.0-1.3.noarch.rpm"
RPM_HASH = "0d29cd6614af656713ee53fb8c378d6b819b9a00f952cdb319f99f8cdddb42f9eb7bb324eb2d8cb9c66e64dc77c353a2d2c1e4a52ba6567b848439a3327a82b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-calendar"

RDEPENDS:${PN} += "gnome-calendar"

inherit rpm
