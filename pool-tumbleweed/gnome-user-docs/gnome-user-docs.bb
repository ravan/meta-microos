SUMMARY = "GNOME Desktop Documentation"
DESCRIPTION = "This package contains documents that are targeted for GNOME end-users."
LICENSE = "CC-BY-3.0"

PV = "50.4"

RPM_NAME = "gnome-user-docs-50.4-1.1.noarch.rpm"
RPM_HASH = "49c03d4ab2ce924bda63bf37a7b9fa98f4d362cb4db7bb0559ac1c5080584926f60845a54d82c9bda57ac8c3d16f1293690f306167bd1377f91566f032ac12e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-user-docs"

RDEPENDS:${PN} += "yelp"

inherit rpm
