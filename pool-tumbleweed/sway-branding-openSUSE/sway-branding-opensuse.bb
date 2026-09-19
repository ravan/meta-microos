SUMMARY = "openSUSE branding of sway"
DESCRIPTION = "This package provides the openSUSE look and feel for sway."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "sway-branding-openSUSE-0.17.0-1.4.noarch.rpm"
RPM_HASH = "e70e5bf0739b09ab0c796b8f30149f44249b53f3c05719257576cb43f4dc187ea96e2208b9de7c0adebdb6846570df071da88115942e9fc0ceb25b354e2b4fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sway-branding-openSUSE \
sway-branding \
sway-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
SwayNotificationCenter \
bc \
brightnessctl \
fontawesome-fonts \
jq \
pamixer \
patterns-sway-sway \
pavucontrol \
playerctl \
polkit-default-privs \
polkit-gnome \
sway \
wallpaper-branding-openSUSE \
wob"

inherit rpm
