SUMMARY = "Extension for accessing Google data"
DESCRIPTION = "An extension for accessing some Google services, such as Google Calendar, \
Google Contacts and Google tasks."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libkgapi6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "cd06021863b5b82bf2b658fe51ed71ae0ee061ae52ed1d8a97a1144c55519d6915516a456ad081a22df7daf3b3d0a020cf2e1be42e63304f52c27271a2bab305"

RPROVIDES:${PN} += "libkgapi6"

RDEPENDS:${PN} += ""

inherit rpm
