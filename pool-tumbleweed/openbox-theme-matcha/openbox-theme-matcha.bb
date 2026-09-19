SUMMARY = "Matcha openbox themes"
DESCRIPTION = "Matcha is a flat Design theme for GTK 4, GTK 3, GTK 2 and Gnome-Shell. \
 \
This package contains the openbox themes."
LICENSE = "GPL-3.0-only"

PV = "20250411"

RPM_NAME = "openbox-theme-matcha-20250411-1.4.noarch.rpm"
RPM_HASH = "e8ce0c0822a6d4d6846706744fbb5eca2a3caeb4bbdfaba97fdac5e1314361c9b1de3799f2fef493b3ea0851517f20f636eb6c6c31b9e9e9eed727c50150e163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-theme-matcha"

RDEPENDS:${PN} += "metatheme-matcha-common \
openbox"

inherit rpm
