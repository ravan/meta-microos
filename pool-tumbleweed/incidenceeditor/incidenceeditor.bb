SUMMARY = "Incidenceeditor library"
DESCRIPTION = "This package contains the incidenceeditor library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "incidenceeditor-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4eae7b3607931bbddf374d024a1e7ef100642063ef0ee09d982bc8de01932e876fced6de1e54e0bd91e605b55a86b78185630e5709b26a7817b435596cc16be3"

RPROVIDES:${PN} += "incidenceeditor"

RDEPENDS:${PN} += ""

inherit rpm
