SUMMARY = "Upstream definitions of default settings and applications"
DESCRIPTION = "This package provides upstream defaults for settings stored with \
GSettings and applications used by the MIME system."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "6.4.1"

RPM_NAME = "libcinnamon-desktop-data-branding-upstream-6.4.1-1.8.noarch.rpm"
RPM_HASH = "f50c1c3a5569b48d5ff9e7babd185a576cc6c82a8d009c4eacb8bd48a2b9a0e5091e762cac8cf47c33f66971887bcc3a2c619fd499a5c76060f9234832fe3fd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libcinnamon-desktop-data-branding \
libcinnamon-desktop-data-branding-upstream"

RDEPENDS:${PN} += "gnome-backgrounds \
libcinnamon-desktop-data \
metatheme-adwaita-common"

inherit rpm
