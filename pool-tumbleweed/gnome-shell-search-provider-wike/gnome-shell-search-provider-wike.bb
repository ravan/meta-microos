SUMMARY = "Wikipedia reader for GNOME -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to return search \
results from wike."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "gnome-shell-search-provider-wike-3.2.1-1.2.noarch.rpm"
RPM_HASH = "e7f753a40283d3ac338036e1f3102da40785654494e31964a31f80511d7b7b990bb2acbd19c89513f0ca34cab9e630c4f8e23ab4064713d20521921e9b65d265"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-wike"

RDEPENDS:${PN} += "gnome-shell \
wike"

inherit rpm
