SUMMARY = "Hyprland screenshot utility"
DESCRIPTION = "Hyprshot is a utility to take screenshot in Hyprland using the mouse. \
 \
It allows taking screenshots of windows, regions and monitors which \
are saved to a folder of choice copied to the clipboard."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+2"

RPM_NAME = "hyprshot-1.3.0+2-1.7.noarch.rpm"
RPM_HASH = "abf9f66b1c5a3867714b50319c87ad0c9c8fb397679b11666164237012547ab10a364ca8635a16f83ed043b4c8dbe950b691443be9a17a2c44d951c14890426c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hyprshot"

RDEPENDS:${PN} += "/usr/bin/bash \
ImageMagick \
grim \
hyprland \
jq \
libnotify-tools \
slurp \
wl-clipboard"

inherit rpm
