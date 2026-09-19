SUMMARY = "openSUSE branding for LXDE"
DESCRIPTION = "This branding-style package sets openSUSE style improvements into LXDE. \
You should always prefer branding-openSUSE packages to branding-upstream."
LICENSE = "GPL-2.0-only"

PV = "12.1"

RPM_NAME = "lxde-common-branding-openSUSE-12.1-38.8.noarch.rpm"
RPM_HASH = "38bd0b14700d5897a40dae675cf9fec63c78f45562749d78674942ee16efde328eb4924d4d4777c9168c283067ba78c5ddede41f625620bc865e3e1f9cb0a281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lxde-common-branding-openSUSE \
lxde-common-branding \
lxde-common-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/sh \
desktop-data-openSUSE \
gtk2-metatheme-adwaita \
gtk3-metatheme-adwaita \
openbox-adwaita-ob-theme \
wallpaper-branding-openSUSE \
xkill"

inherit rpm
