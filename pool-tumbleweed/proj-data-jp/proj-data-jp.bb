SUMMARY = "Japan datum grids for Proj"
DESCRIPTION = "Japan datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-jp-9.8.1-2.3.noarch.rpm"
RPM_HASH = "f0a0bfe2b6616ed29b017ff9b69ece89a82143ec6a4d1275be1073cfef6cf5d12d7b3537820abca94efb3335f9ff9de72137cebb0e628ca9a3ad1dcfc1fdec24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-jp"

RDEPENDS:${PN} += ""

inherit rpm
