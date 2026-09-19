SUMMARY = "A Network Manager for Tiling Window Managers"
DESCRIPTION = "A Network manager for Tiling Window Managers [i3/bspwm/awesome/etc] or not. Inspired from rofi-wifi-menu."
LICENSE = "MIT"

PV = "0.0.0.git~19a3780"

RPM_NAME = "rofi-network-manager-0.0.0.git~19a3780-1.9.noarch.rpm"
RPM_HASH = "11b37129bdcf11c56d1d99be1d22678fff7d080dceaec71586090b2be1e25df7806618ff1ad88df8bd1d48d5a52b13f22b9ddcb4623b8c440d7a55b168cfb4ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rofi-network-manager"

RDEPENDS:${PN} += "/usr/bin/bash \
NetworkManager \
NetworkManager-connection-editor \
qrencode"

inherit rpm
