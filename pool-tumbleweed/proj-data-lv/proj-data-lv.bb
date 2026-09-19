SUMMARY = "Latvia datum grids for Proj"
DESCRIPTION = "Latvia datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-lv-9.8.1-2.3.noarch.rpm"
RPM_HASH = "b1758811e699ecc172ce79afa54e5b94dbdca9e5470a5c93451564bc96e5421dc0be9048ea85c314e7469d86d468a4122a24cdec9a62cd6973c73645f77148d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-lv"

RDEPENDS:${PN} += ""

inherit rpm
