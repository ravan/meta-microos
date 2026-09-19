SUMMARY = "IBus customization extension for GNOME Shell"
DESCRIPTION = "This GNOME shell extension customizes the appearance and behavior of the IBus \
input framework, including its system tray. It also implements an input source \
indicator."
LICENSE = "GPL-3.0-or-later"

PV = "94"

RPM_NAME = "gnome-shell-extension-customize-ibus-94-1.1.noarch.rpm"
RPM_HASH = "4c71f7440c5573478d91ef4769a0f344a63f3990d70683252568978fe4e8c752784a07bd70c3a0a3e2ce2fab200e101ffc1aa8e419bb39449e61c70147cf39be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-customize-ibus"

RDEPENDS:${PN} += "gnome-shell \
gnome-tweaks"

inherit rpm
