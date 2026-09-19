SUMMARY = "Upstream branding of lightdm-slick-greeter"
DESCRIPTION = "This package provides the upstream look and feel for \
lightdm-slick-greeter."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-branding-upstream-1.6.1-2.10.noarch.rpm"
RPM_HASH = "d2c1d1aee2e71deb6b0b134273a82efb2fe657da64105d9d863df7ea858cad3b0aebf3b8dcf95137380884db889c901249f47619fb56bcd847104a9d09877d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-slick-greeter-branding \
lightdm-slick-greeter-branding-upstream"

RDEPENDS:${PN} += "gnome-icon-theme \
gtk3-metatheme-adwaita \
lightdm-slick-greeter \
ubuntu-fonts"

inherit rpm
