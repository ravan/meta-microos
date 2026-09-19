SUMMARY = "Note taking app -- Search Provider for GNOME Shell"
DESCRIPTION = "Iotas is a simple note taking with mobile-first design and optional speedy \
Nextcloud Notes sync. \
 \
This package provides a search provider for gnome-shell to show notes in iotas \
with matching titles."
LICENSE = "GPL-3.0-or-later"

PV = "0.12.7"

RPM_NAME = "gnome-shell-search-provider-iotas-0.12.7-1.2.noarch.rpm"
RPM_HASH = "b577330ff0bd7c8b6466b57d2b2acc0b7d0580503ece93227362d097bf09e00f062fe9f458a80f18c2843d670d1fd2ae9bc3222b9296f35ae677010f7943931a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-iotas"

RDEPENDS:${PN} += "gnome-shell \
iotas"

inherit rpm
