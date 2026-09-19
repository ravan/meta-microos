SUMMARY = "Footprint library for KiCad"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This is the footprints library package for KiCad."
LICENSE = "CC-BY-SA-4.0"

PV = "10.0.6"

RPM_NAME = "kicad-footprints-10.0.6-1.1.noarch.rpm"
RPM_HASH = "fa87ef901439d69fcd218090dfb3d93d691423f68fd4ccea70393444d623e386f4d03de87717d9be6104bccbc6db694099b8ab84c5903280d03a3a6efaad67d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-footprints \
kicad-library-/usr/share/kicad/template/fp-lib-table"

RDEPENDS:${PN} += ""

inherit rpm
