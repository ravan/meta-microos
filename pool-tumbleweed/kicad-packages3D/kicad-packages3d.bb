SUMMARY = "3D model libraries for rendering and MCAD integration"
DESCRIPTION = "KiCad is a software suite used for Electronic Design Automation (EDA). \
 \
This package contains 3D models associated with the various KiCad footprint \
library components for rendering and mechanical CAD (MCAD) integration."
LICENSE = "CC-BY-SA-4.0"

PV = "10.0.6"

RPM_NAME = "kicad-packages3D-10.0.6-1.1.noarch.rpm"
RPM_HASH = "743fec3b2e11fbe5460fcb0672f81d7e5bfb3eccce103742ae4c776bd73e95f521ae5a1b531efa0906945cd4467336bf9e384c112b7f4f4b6ad23e1ab3dd312b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-library-3d \
kicad-packages3D"

RDEPENDS:${PN} += "kicad-footprints"

inherit rpm
