SUMMARY = "GNOME Photos -- Search Provider for GNOME Shell"
DESCRIPTION = "This package contains a search provider to enable GNOME Shell to get \
search results from GNOME Photos."
LICENSE = "GPL-3.0-or-later"

PV = "44.0+23"

RPM_NAME = "gnome-shell-search-provider-gnome-photos-44.0+23-3.6.noarch.rpm"
RPM_HASH = "3f1ea20e235b567d29d8401b68e7f680dadf0401d1fb2ec874a9e850cb392fae9a177cf4dc6da6be8e7f8a3257b581c0948b5ff0ada8f231052a7b858b247d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-gnome-photos"

RDEPENDS:${PN} += "gnome-photos"

inherit rpm
