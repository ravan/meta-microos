SUMMARY = "Compatibility metapackage for X.Org core applications"
DESCRIPTION = "This package is a compatibility metapackage. It requires the \
X.Org core applications packages."
LICENSE = "MIT"

PV = "7.6_1"

RPM_NAME = "xorg-x11-essentials-7.6_1-17.5.noarch.rpm"
RPM_HASH = "e96a04d8eec4f4186d3676a78aaeb93d20ee03bae874428cb469abf68acd0a14c3e3ef8faed044e95687c0f45c68c1015c354b26f8480f2021cfa72f0a79ea35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorg-x11-essentials"

RDEPENDS:${PN} += "iceauth \
mkfontdir \
mkfontscale \
rgb \
sessreg \
setxkbmap \
xauth \
xconsole \
xdm \
xinit \
xkbcomp \
xmessage \
xmodmap \
xprop \
xrdb \
xset \
xsetroot"

inherit rpm
