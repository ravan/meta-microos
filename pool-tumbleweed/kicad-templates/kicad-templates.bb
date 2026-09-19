SUMMARY = "Project templates for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the project templates package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "10.0.6"

RPM_NAME = "kicad-templates-10.0.6-1.1.noarch.rpm"
RPM_HASH = "859012b785e259d3eb7dc407ce6bdd75015d486471a12a979f6c2a9f54e6b2d97b081bed1a6ab1305e1f34ce2405f389bee38fb7f53c3115dd202f2bc5a492c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library-/usr/share/kicad/template/Arduino-Fio/fp-lib-table \
kicad-templates"

RDEPENDS:${PN} += ""

inherit rpm
