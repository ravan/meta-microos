SUMMARY = "openSUSE branding of lightdm-slick-greeter"
DESCRIPTION = "This package provides the openSUSE look and feel for \
lightdm-slick-greeter."
LICENSE = "GPL-3.0-only"

PV = "1.0"

RPM_NAME = "lightdm-slick-greeter-branding-openSUSE-1.0-4.6.noarch.rpm"
RPM_HASH = "d15b935babf55339895279c52f9b1e4de2fcb5cdda2c6a734ea32106e7c428810412aa487314a398b709ac1f35919b6037fddbe335b04df03a9a12964b37af04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-slick-greeter-branding \
lightdm-slick-greeter-branding-openSUSE"

RDEPENDS:${PN} += "adwaita-icon-theme \
cantarell-fonts \
gtk3-metatheme-adwaita \
lightdm-slick-greeter \
wallpaper-branding-openSUSE"

inherit rpm
