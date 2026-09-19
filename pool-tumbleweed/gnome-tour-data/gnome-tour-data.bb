SUMMARY = "GNOME Tour data"
DESCRIPTION = "GNOME Tour & Greeter data files"
LICENSE = "GPL-3.0-or-later"

PV = "50.0.openSUSE+git20260413.334ffbd"

RPM_NAME = "gnome-tour-data-50.0.openSUSE+git20260413.334ffbd-1.3.noarch.rpm"
RPM_HASH = "88670b5e6caee0674d9e5f2b8cfd2112fb6664f2755705ae02200cd818506994fbe3450b53248b51e9c757e63bd1789b8fdcc51063262d653746b0ea48038682"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-tour-data"

RDEPENDS:${PN} += ""

inherit rpm
