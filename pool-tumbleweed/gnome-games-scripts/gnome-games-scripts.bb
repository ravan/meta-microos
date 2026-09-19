SUMMARY = "Build helpers for gnome game packages"
DESCRIPTION = "gnome-games-scripts is nothing more than a helper package producing \
the post scriptlets for various gnome-games descendents. \
 \
The script does not serve much purpose out of this usecase."
LICENSE = "MIT"

PV = "3.8.0"

RPM_NAME = "gnome-games-scripts-3.8.0-6.19.noarch.rpm"
RPM_HASH = "a06e7184e19e96283508e7275b01af3d993883a43d22b5664c55bb11ddd02b9ef4bf9be5358446a89ab946c89ae887ee824d5b4b70bbed755b07be634f5998b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-games-scripts"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
