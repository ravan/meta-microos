SUMMARY = "Japanese Fixed Fonts for the X Window System"
DESCRIPTION = "This Package contains Japanese fixed-width fonts for X11. \
 \
It contains the fonts knj10, kaname-alter, shinonome12, shinonome16, \
k14goth, Kappa20, kanji32, and marumoji. \
 \
On top of that, it also contains bold, italic, and bold-italic versions \
of the popular Japanese fonts usually found in the \
/usr/lib/X11/fonts/misc directory of the standard X11 distribution and \
bold, italic, and bold-italic versions of iso-8859-1 fonts which fit \
nicely in style and width to the Japanese fonts."
LICENSE = "SUSE-Public-Domain & HPND"

PV = "20020904"

RPM_NAME = "x11-japanese-bitmap-fonts-20020904-654.22.noarch.rpm"
RPM_HASH = "b7f293fbd950f97918c0f6d5ffeb02e75b61be211ece7380f00020444066961c4ece5b5fd2fa9fbbc2f51e31dcc86c68b125f73a1b105566009c5961dd76b72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xorg-x11-ja \
x11-japanese-bitmap-fonts \
xfntjp"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
