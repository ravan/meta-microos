SUMMARY = "Header and library from gmic for use in other C++ projects"
DESCRIPTION = "Header and library from gmic to needed to develop C++ code that \
uses the gmic functionality provided by the gmic library."
LICENSE = "CECILL-2.1"

PV = "4.0.3"

RPM_NAME = "libgmic-devel-4.0.3-1.2.aarch64.rpm"
RPM_HASH = "dc9217a038400bb021ac6db1b6c46dd1f32aae9d63be731ecae2e2e44c4cbad5aff453a812ec046dca42a16ab59a9b0f195121f6f6d75bbb6adba11fbaaa5407"

RPROVIDES:${PN} += "libgmic-devel"

RDEPENDS:${PN} += "libcgmic4 \
libgmic4"

inherit rpm
