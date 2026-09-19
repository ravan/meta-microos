SUMMARY = "Visual Display Unit virtual control panel"
DESCRIPTION = "vdu_controls is a virtual control panel for externally connected \
VDUs (visual display units).  Controls are included for backlight \
brightness, and contrast.  vdu_controls uses the ddcutil command \
line utility to interact with external displays via VESA Display \
Data Channel (DDC) Virtual Control Panel (VCP) standards."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.9"

RPM_NAME = "vdu_controls-2.6.9-1.1.noarch.rpm"
RPM_HASH = "e7768e3c6210f396e3de043437475c89d44724f457d08349cc32d14fceb5e2c54d7f3ce6535c1b2df6fc87a54eed303f89438115f6f645e2a2d6906f1b651d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vdu-controls"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
/usr/bin/sh \
ddcutil \
noto-sans-math-fonts \
noto-sans-symbols2-fonts \
python3 \
python3-qt6"

inherit rpm
