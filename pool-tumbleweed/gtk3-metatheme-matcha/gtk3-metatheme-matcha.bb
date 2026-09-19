SUMMARY = "Matcha GTK+3 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GTK3+ themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "gtk3-metatheme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "2e4a9fdee92f3881f61228637c4335ceada3916bc0244c1d82359978cc2f83712e72aab38d562b3f07687981599c02a147a087693705f82696c5105c9d705498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-matcha"

RDEPENDS:${PN} += "gtk3 \
metatheme-matcha-common"

inherit rpm
