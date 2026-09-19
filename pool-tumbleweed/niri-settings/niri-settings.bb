SUMMARY = "GUI in PyQt for configuring niri"
DESCRIPTION = "GUI application for configuring the Niri Wayland Compositor"
LICENSE = "GPL-2.0"

PV = "0~git.20251225.d20e9f5"

RPM_NAME = "niri-settings-0~git.20251225.d20e9f5-1.3.noarch.rpm"
RPM_HASH = "eb350c5afa1e629804056d0359d619dacf568502bd1c959f9156c6512b1ca8c7a7cb66e85ccfb5e5f5c86f0310c1609d72278959c1f9982293ecd8d067619376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "niri-settings"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
niri \
python3-PyQt6 \
qt6-wayland"

inherit rpm
