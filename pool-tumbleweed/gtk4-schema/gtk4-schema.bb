SUMMARY = "Config schema for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.5"

RPM_NAME = "gtk4-schema-4.22.5-1.1.noarch.rpm"
RPM_HASH = "e1df33286604b2cdc317911fb88aed8577d065416571396feed0174b962bc864aa47f7695eabadbabce7f789be58e35f493563564b297b8c6637497560a0477d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-schema"

RDEPENDS:${PN} += ""

inherit rpm
