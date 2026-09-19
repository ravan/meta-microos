SUMMARY = "Header files for the GNOME Control Center"
DESCRIPTION = "The control center is GNOME's main interface for configuration of \
various aspects of your desktop."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-control-center-devel-50.4-1.1.noarch.rpm"
RPM_HASH = "855e4780ff0d39b2ee8403e861d8366a36a48e4bc49f5c3b05e73315dcc916773e47d96d44917fe101eccb8b1ec316747d83fc94bbaaf5cc79b8f067bb81c2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-devel \
pkgconfig-gnome-keybindings"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-control-center"

inherit rpm
