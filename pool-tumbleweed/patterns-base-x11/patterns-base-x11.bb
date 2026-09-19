SUMMARY = "X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-x11-20241218-34.1.aarch64.rpm"
RPM_HASH = "f0e469f50d32767cc786665a3bcfd816883d9d2331b21e2792086877ddcc3b3ef20aeb42406bb3e2650ab95f3d84633f850d1c19224c1134ecf4ae0a97f70b72"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-x11 \
patterns-openSUSE-x11"

RDEPENDS:${PN} += "pattern- \
xf86-input-libinput \
xorg-x11-fonts-core \
xorg-x11-server"

inherit rpm
