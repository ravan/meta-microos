SUMMARY = "Documentation and tutorials for KiCad"
DESCRIPTION = "Kicad is an open source software for the creation of electronic \
schematic diagrams and printed circuit board artwork. \
This is the documentation package for KiCad. It contains documentation \
and tutorials."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "10.0.6"

RPM_NAME = "kicad-doc-10.0.6-1.1.noarch.rpm"
RPM_HASH = "0746a93a3ea6b6d4d1453bd08f814aa4137567f210fcc47c690887022f3d218f5488860d45d46f1076540853268a210f60bebe2e78b9e9aa7945ae1e01a7656e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc"

RDEPENDS:${PN} += ""

inherit rpm
