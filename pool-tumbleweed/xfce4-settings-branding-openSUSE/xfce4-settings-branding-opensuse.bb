SUMMARY = "openSUSE Branding of xfce4-settings"
DESCRIPTION = "This package provides the openSUSE look and feel for Xfce."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later"

PV = "4.20.0+git1.d2555b3"

RPM_NAME = "xfce4-settings-branding-openSUSE-4.20.0+git1.d2555b3-3.10.noarch.rpm"
RPM_HASH = "b61af10ab56c718d5612499c8e75f91965e158a506c9f7fcc67c96c4c8b3fd2ffb2012c61b120800c99a64219834c2f86b1d3d236d941ce3fd880be65a34e49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-xfce4-settings-branding-openSUSE \
xfce4-settings-branding \
xfce4-settings-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-xfce-icon-theme \
desktop-data-openSUSE \
gtk3-metatheme-adwaita \
gtk3-metatheme-greybird-geeko \
hack-fonts \
metatheme-greybird-geeko-common \
noto-coloremoji-fonts \
noto-sans-fonts"

inherit rpm
