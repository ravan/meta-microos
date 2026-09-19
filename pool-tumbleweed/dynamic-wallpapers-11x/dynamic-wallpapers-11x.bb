SUMMARY = "Dynamic wallpapers for GNOME, from previous versions of openSUSE"
DESCRIPTION = "This package contains dynamic wallpapers from previous versions of \
openSUSE. \
 \
A dynamic wallpaper changes depending on the time of the day: it is \
generally bright during the day, and dark during the night."
LICENSE = "GPL-3.0 & CC-BY-SA-2.5"

PV = "11.4"

RPM_NAME = "dynamic-wallpapers-11x-11.4-13.24.noarch.rpm"
RPM_HASH = "4591f4c552dbaffe7f8e54064c704e8d70801097bfa9a115c66ae68e230f08fa4b6d07f6455e5f00ec339eaf4ff963cfcb3e51fe044d057bdaa49f2d8a010ed8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dynamic-wallpapers-11x \
openSUSE-dynamic-wallpapers-old"

RDEPENDS:${PN} += ""

inherit rpm
