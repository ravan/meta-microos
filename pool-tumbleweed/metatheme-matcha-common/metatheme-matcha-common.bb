SUMMARY = "Matcha common theme files"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains common files for all Matcha themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "metatheme-matcha-common-20250411-1.4.noarch.rpm"
RPM_HASH = "fa233c986b0df2cf9e9b97c5ec5a0f06cd8e47b636ce16f68f4c8b10e221e7e77bc870b70b55e4a1593dfeec9fb97b46b32c385d77ff1fddf3864bb9f5331695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "matcha-gtk-theme \
metatheme-matcha-common"

RDEPENDS:${PN} += "google-roboto-fonts \
noto-sans-fonts"

inherit rpm
