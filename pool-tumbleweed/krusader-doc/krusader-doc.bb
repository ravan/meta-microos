SUMMARY = "Krusader documentation"
DESCRIPTION = "Krusader is an advanced twin panel (commander style) file manager for KDE Plasma \
and other desktops in the *nix world. \
 \
This package contains the krusader documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "krusader-doc-2.9.0-1.6.aarch64.rpm"
RPM_HASH = "2f8b511938265ca21c1872ab91f41dec20497eabe039255d1d3c61d566691c32e4de0cc9dfc4a2d402a4fda8f898177ebf71c01c97c90fea1fdb6851a6a965ea"

RPROVIDES:${PN} += "krusader-doc"

RDEPENDS:${PN} += ""

inherit rpm
