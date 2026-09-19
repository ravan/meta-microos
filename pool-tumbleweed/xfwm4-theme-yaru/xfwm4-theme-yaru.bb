SUMMARY = "Yaru Xfmw4 themes"
DESCRIPTION = "This is the theme shaped by the community on the Ubuntu hub. \
 \
This package contains the Xfwm4 themes"
LICENSE = "CC-BY-SA-4.0 & GPL-3.0-or-later & LGPL-2.1-only & LGPL-3.0-only"

PV = "24.04.0"

RPM_NAME = "xfwm4-theme-yaru-24.04.0-1.9.noarch.rpm"
RPM_HASH = "28098cf8702610eb2c810c8927ef7bf3940fc62492128d2df1306085a908fadc50162186f6a42bed590c44361ff143d50dc323b91ca1709415378866146ee184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfwm4-theme-yaru"

RDEPENDS:${PN} += "metatheme-yaru-common \
xfwm4"

inherit rpm
