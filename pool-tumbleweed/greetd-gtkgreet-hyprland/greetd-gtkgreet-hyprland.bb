SUMMARY = "Greetd config using gtkgreet and Hyprland Wayland session"
DESCRIPTION = "This package configures greetd to use gtkgreet in the Cage Wayland compositor, \
and provides a session environment that launches Hyprland in Wayland mode."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "greetd-gtkgreet-hyprland-1.0-1.2.noarch.rpm"
RPM_HASH = "11eb1eb93587993d82a1bc90ef1f7e1cd688e43260a1bd5ea9a0461eb0ef82ba0e1ff003ea8f582be583baccdb58d66c53ae226cdd0d68eb7ffc47de804bae33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-greetd-gtkgreet-hyprland \
greetd-branding \
greetd-gtkgreet-hyprland"

RDEPENDS:${PN} += "cage \
greetd \
gtkgreet"

inherit rpm
