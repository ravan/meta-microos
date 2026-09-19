SUMMARY = "Upstream branding of lightdm-gtk-greeter"
DESCRIPTION = "This package provides the upstream look and feel for lightdm-gtk-greeter."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.8"

RPM_NAME = "lightdm-gtk-greeter-branding-upstream-2.0.8-1.25.noarch.rpm"
RPM_HASH = "5ab96aefb711e0b388662d397a91580da63b2904eed05fe72c9edc315b6ad27d9ee2126a758f3fefee661840fa52601c4ddb9159a4c7d50615ee072ad2172c9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-lightdm-gtk-greeter-branding-upstream \
lightdm-gtk-greeter-branding \
lightdm-gtk-greeter-branding-upstream"

RDEPENDS:${PN} += "lightdm-gtk-greeter"

inherit rpm
