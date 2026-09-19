SUMMARY = "TUI Application launcher with Desktop Entry support"
DESCRIPTION = "This is a TUI-based launcher menu made with bash and the amazing fzf. Despite its name, it does not depend on the Sway window manager can be used with just about any WM."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "sway-launcher-desktop-1.7.0-2.7.noarch.rpm"
RPM_HASH = "eca7c3850946cb28c9067c08df0a60d1df7c439e9c687241725a06e9539ade5f9b8d1a83a931e57fd0db1a9fb9848db988ddcecfd1b0fea943467a3fc3687a3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sway-launcher-desktop"

RDEPENDS:${PN} += "/usr/bin/bash \
fzf"

inherit rpm
