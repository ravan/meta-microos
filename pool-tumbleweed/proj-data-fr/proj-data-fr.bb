SUMMARY = "France datum grids for Proj"
DESCRIPTION = "France datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-fr-9.8.1-2.3.noarch.rpm"
RPM_HASH = "958a7ca98133728979e5819f794757b952a7c9cc490d46f7bb90e2a73f765c9b65cb437891aa6dbf7d42fb74730263d3a60fcda62ea201697c96ea5881f5cb29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fr"

RDEPENDS:${PN} += ""

inherit rpm
