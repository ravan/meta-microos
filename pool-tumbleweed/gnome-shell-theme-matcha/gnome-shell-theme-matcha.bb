SUMMARY = "Matcha GNOME Shell themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the GNOME Shell themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "gnome-shell-theme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "db2ca9f83902c913124f8940e7b3d34c3b9093021c031db625d2ff424fa19f5c4666efb621a31399fee8339b50c4b89f726ec0fa70a2e7209b4e74a40766ff4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-theme-matcha"

RDEPENDS:${PN} += "gnome-shell \
metatheme-matcha-common"

inherit rpm
