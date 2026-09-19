SUMMARY = "Translations for package screengrab"
DESCRIPTION = "Provides translations for the 'screengrab' package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.2.0"

RPM_NAME = "screengrab-lang-3.2.0-2.1.noarch.rpm"
RPM_HASH = "6c0eeb11fca7fe85fcee3a62b1a0c5665f3d8e047a31063c881157bd31bc45693e81fc792e7fbf68871a65c2f4cc590a503e4482b6cf2d75ecae0e10e03265e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "screengrab-lang \
screengrab-lang-all"

RDEPENDS:${PN} += "screengrab"

inherit rpm
