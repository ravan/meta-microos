SUMMARY = "Enhanced X Window System"
DESCRIPTION = "The X Window System provides the only standard platform-independent networked graphical window system bridging the heterogeneous platforms in today's enterprise: from network servers to desktops, thin clients, laptops, and handhelds, independent of operating system and hardware."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-x11_enhanced-20241218-34.1.aarch64.rpm"
RPM_HASH = "8ff6d94bba8d76a65d2ed571231fd5251a19cc2414f607dbbe1e6d83d90b92b74fbe35e0b9741433ed5f08cd8d24790f4db11dbb6248defca6d07feb2be8ab70"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-base-x11-enhanced"

RDEPENDS:${PN} += "glibc-locale \
glibc-locale-base \
pattern- \
xkeyboard-config \
xorg-x11-essentials"

inherit rpm
