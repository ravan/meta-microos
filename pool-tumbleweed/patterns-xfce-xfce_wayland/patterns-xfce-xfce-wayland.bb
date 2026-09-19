SUMMARY = "XFCE Desktop Environment (Experimental Wayland Variant)"
DESCRIPTION = "Experimental Xfce desktop environment adapted for Wayland, using a lighter and modern graphical stack \
while keeping the familiar experience. This variant avoids traditional X11 components."
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_wayland-20230212-12.3.aarch64.rpm"
RPM_HASH = "15bd7c8853607f5c2714e50590307b31841994fe7802beb18cb8d15ef981ec4a6449d076191e19f9b2f33c970f6f8e46a999883c57ab69cfdf5ff53195ce3e30"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-xfce-wayland \
patterns-xfce-xfce-wayland"

RDEPENDS:${PN} += "pattern-"

inherit rpm
