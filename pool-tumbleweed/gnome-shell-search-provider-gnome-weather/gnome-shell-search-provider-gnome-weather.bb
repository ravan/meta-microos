SUMMARY = "GNOME Weather -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Weather."
LICENSE = "GPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-shell-search-provider-gnome-weather-50.0-1.2.noarch.rpm"
RPM_HASH = "679f5bc4b8d195c4dcc9a4989f14096abf052b35b31803255e3a5bec1e5e78e863d9344e20949af1643328c3f86c653e8b5bc09d742c86f53b324bc04ddcbc0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-weather"

RDEPENDS:${PN} += "gnome-weather"

inherit rpm
