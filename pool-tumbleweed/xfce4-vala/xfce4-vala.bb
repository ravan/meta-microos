SUMMARY = "Vala Bindings to Xfce Libraries"
DESCRIPTION = "This package provides Vala bindings to Xfce Libraries."
LICENSE = "LGPL-2.1+"

PV = "4.10.3"

RPM_NAME = "xfce4-vala-4.10.3-17.19.noarch.rpm"
RPM_HASH = "e5266e26a6ff0e710c81cfef3d13c031b8b6d4840e6a849428df5a5ed220b648bc6d548e4201e70c0e5188fa2916f61eb1ef972cdaa126500441e266bc29eb7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-xfce4-vala \
xfce4-vala"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
vala"

inherit rpm
