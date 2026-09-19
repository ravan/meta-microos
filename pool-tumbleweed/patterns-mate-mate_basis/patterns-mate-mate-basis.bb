SUMMARY = "MATE Base System"
DESCRIPTION = "Base packages for the MATE desktop environment."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_basis-20170319-6.3.aarch64.rpm"
RPM_HASH = "7c2b83c759214f3ec06da9685624490e4d368eef608d9671b75409aeb3602756161cb1fe1a026358cdd9bf629e1b44dc5c8f83fad6e67c67d89b1000bb0ee7e5"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-basis"

RDEPENDS:${PN} += "caja \
dbus-org.freedesktop.Notifications \
lightdm \
marco \
mate-control-center \
mate-desktop \
mate-panel \
mate-session-manager \
mate-settings-daemon \
pattern- \
xdg-desktop-portal-gtk"

inherit rpm
