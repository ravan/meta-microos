SUMMARY = "Schematic symbol library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the schematic symbol library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "10.0.6"

RPM_NAME = "kicad-symbols-10.0.6-1.1.noarch.rpm"
RPM_HASH = "d48c856a8f483b38ca792d8c68e53578f3086e6e743713a51afb8179e549a916ef3d3c88d9bfae9706e0c7dc014122d05bd8b7036033c48b8064809ec746f3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library \
kicad-symbols"

RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
