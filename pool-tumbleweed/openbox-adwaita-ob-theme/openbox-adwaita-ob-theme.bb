SUMMARY = "Adwaita theme for the Openbox Window Manager"
DESCRIPTION = "This package contains an Openbox theme created to mimic GNOME's Adwaita theme."
LICENSE = "GPL-3.0"

PV = "0.1"

RPM_NAME = "openbox-adwaita-ob-theme-0.1-3.24.noarch.rpm"
RPM_HASH = "6c5cf524d81049d8f944088a8d3172c18f6e8de096901d217ef29fc3fe581b4c55e49c46cada2ad17d56a28980083d7946681f6d163de18667372d293cc31975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-adwaita-ob-theme"

RDEPENDS:${PN} += "openbox"

inherit rpm
