SUMMARY = "Poland datum grids for Proj"
DESCRIPTION = "Poland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-pl-9.8.1-2.3.noarch.rpm"
RPM_HASH = "7ea41b595fac53af0e75486a32af202acf936dd1b7a97d4244ce42915913d6c599ad64c5ebff010d7484029dda7f2c1b4c017304bd6d8259eddfe5ae661f0b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-pl"

RDEPENDS:${PN} += ""

inherit rpm
