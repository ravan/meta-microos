SUMMARY = "SDDM Light/Dark themes for Kalpa"
DESCRIPTION = "Kalpa Desktop Light and Dark sddm themes"
LICENSE = "GPL-2.0 & MIT & CC-BY-SA-4.0"

PV = "1.0"

RPM_NAME = "kalpa-themes-sddm-1.0-1.2.noarch.rpm"
RPM_HASH = "3189edb2d786f0e0e5d44520f30fa06077174ffb63165a1758e708a7969ca86fead8be47b6a7118457b3ff66b4cf1cc80a3ca9941a6f1530bc93ef393b280fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalpa-themes-sddm \
sddm-theme-openSUSE"

RDEPENDS:${PN} += "kalpa-themes"

inherit rpm
