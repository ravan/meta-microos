SUMMARY = "openSUSE branding of the Budgie Desktop Environment"
DESCRIPTION = "This package provides the openSUSE look and feel for the Budgie \
desktop environment."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-only"

PV = "20250305.1"

RPM_NAME = "budgie-desktop-branding-openSUSE-20250305.1-2.4.noarch.rpm"
RPM_HASH = "ec83f8c267191c24473cb21ac6ec6d07bc70e49f8a8acc19d0a6129ae38112a65901a85586db7b4c83eb4c6cabe35ba27b3a2ea09c8e1371b6b36ce6267d1060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-branding \
budgie-desktop-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-icon-theme \
branding-openSUSE \
budgie-desktop \
gio-branding-openSUSE \
gtk3-metatheme-greybird-geeko \
papirus-icon-theme \
systemd-icon-branding \
wallpaper-branding-openSUSE"

inherit rpm
