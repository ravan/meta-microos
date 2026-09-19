SUMMARY = "Documentation files for the Budgie Desktop"
DESCRIPTION = "This package provides API Documentation for the Budgie Plugin API, in the \
GTK-Doc HTML format."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.10.0+13"

RPM_NAME = "budgie-desktop-doc-10.10.0+13-1.2.aarch64.rpm"
RPM_HASH = "a3bab1f3e29cf29da432fd528730438dc44345e9d77d5378c9985a7edbc604b5cf650a8df8cc9387d2106605cd398da3f2955baa990acc313e1e1fa9c472d974"

RPROVIDES:${PN} += "budgie-desktop-doc"

RDEPENDS:${PN} += ""

inherit rpm
