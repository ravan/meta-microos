SUMMARY = "WPA supplicant graphical front-end"
DESCRIPTION = "This package contains a graphical front-end to wpa_supplicant, an \
implementation of the WPA Supplicant component."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "2.12"

RPM_NAME = "wpa_supplicant-gui-2.12-1.1.aarch64.rpm"
RPM_HASH = "e08f1247aa1ecb243749b0ec36457ae8a66e46ed08ad17834cf47619c222d4ec76e863ea15790268c7eae43c69880fbd5b95682966824f8e4f41d6b96d41d21f"

RPROVIDES:${PN} += "wpa-supplicant-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
wpa-supplicant"

inherit rpm
