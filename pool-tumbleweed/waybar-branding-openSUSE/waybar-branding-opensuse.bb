SUMMARY = "openSUSE branding of waybar"
DESCRIPTION = "This package provides the openSUSE look and feel for waybar."
LICENSE = "MIT"

PV = "0.17.0"

RPM_NAME = "waybar-branding-openSUSE-0.17.0-1.4.noarch.rpm"
RPM_HASH = "7e5854eae60696be16ed40b3c1d77815c22c9159a0bd5993550ab1d54cfd6bf5ab1dd300cfd6dc492d2ee59b79b86e397c47a0450be09f5b58d1643ddf6c6637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-waybar-branding-openSUSE \
waybar-branding \
waybar-branding-openSUSE"

RDEPENDS:${PN} += "/usr/bin/bash \
adobe-sourcesanspro-fonts \
fontawesome-fonts"

inherit rpm
