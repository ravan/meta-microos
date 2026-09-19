SUMMARY = "Matcha Metacity themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the metacity themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "metacity-theme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "373056a3d98d09edbd110646b1ce8f8eef2fc9950b2e15914eed91bcc07c47b7416ebbf8a3292ec3e71c441a0261fe571333b4bfb2edcbb39010b9b08e6d0a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metacity-theme-matcha"

RDEPENDS:${PN} += "metacity \
metatheme-matcha-common"

inherit rpm
