SUMMARY = "XFCE Base System"
DESCRIPTION = "Base packages for the XFCE Desktop Environment"
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_basis-20230212-12.3.aarch64.rpm"
RPM_HASH = "c63ab3f2eca52ba85f6b5744941ac8db55f73dba9bcb782412fc7948d9d33de847233a8cfa6d5f1dab49fe594ec68bf78c3d5396b8265fc97175f19637e7e894"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-openSUSE-xfce-basis \
patterns-xfce-xfce-basis"

RDEPENDS:${PN} += "pattern- \
thunar \
thunar-volman \
xfce4-appfinder \
xfce4-notifyd \
xfce4-panel \
xfce4-power-manager \
xfce4-session \
xfce4-settings \
xfconf \
xfdesktop \
xfwm4"

inherit rpm
