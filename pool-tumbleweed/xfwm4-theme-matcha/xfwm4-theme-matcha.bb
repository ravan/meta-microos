SUMMARY = "Matcha Xfwm4 themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the Xfwm4 themes. \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
 \
This package contains the Plank themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "xfwm4-theme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "ef5a5d097b9d61133c83ff5ad14f93bfad25545815b359cfb35392e2614780c6378cd58f6ebadbfc6eef08d1c5db26cdf3278c398cf2db298e6d94b7d60f83da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xfwm4-theme-matcha"

RDEPENDS:${PN} += "metatheme-matcha-common \
xfwm4"

inherit rpm
