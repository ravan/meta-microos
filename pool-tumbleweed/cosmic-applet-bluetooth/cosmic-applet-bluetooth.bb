SUMMARY = "Debug sources for package cosmic-applets"
DESCRIPTION = "Debug sources for package cosmic-applets."
LICENSE = "GPL-3.0-only"

PV = "1.0.14"

RPM_NAME = "cosmic-applet-bluetooth-1.0.14-1.3.noarch.rpm"
RPM_HASH = "e19f1496396a690948aa318632df0cc8641cb058cd473c12a361cd6f8a0a3eb7926f0bba324f04634eae63518cdcedf4f4a0d916bc65f06245b015dc9b7bc15c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cosmic-applet-bluetooth"

RDEPENDS:${PN} += "cosmic-applets"

inherit rpm
