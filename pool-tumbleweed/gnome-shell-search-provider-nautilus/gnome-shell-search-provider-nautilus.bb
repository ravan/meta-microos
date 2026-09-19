SUMMARY = "File Manager for the GNOME Desktop -- Search Provider for GNOME Shell"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains a search provider to enable GNOME Shell to get \
search results from Files (nautilus)"
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "50.3.1"

RPM_NAME = "gnome-shell-search-provider-nautilus-50.3.1-1.1.noarch.rpm"
RPM_HASH = "6e3fe1ede6e1601e5cd24126f75d2a7a073c9cdf2f3356b3afced657d6014707f72f6b6dcac7f7bb999ff3429bd9c98aff871c32a9d9bb16b933f491c8832578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-search-provider-nautilus"

RDEPENDS:${PN} += "gnome-shell \
nautilus"

inherit rpm
