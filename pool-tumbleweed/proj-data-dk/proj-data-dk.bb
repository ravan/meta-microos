SUMMARY = "Denmark datum grids for Proj"
DESCRIPTION = "Denmark datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-dk-9.8.1-2.3.noarch.rpm"
RPM_HASH = "51ac4de0aefb0a7e7a93cfdb202e03997df2924d954a9c105da0b305959eb6c16fa870ded942ea3a929aae741dcad7155a8e916b47e04fdbfa8e7cd6912c006a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-dk"

RDEPENDS:${PN} += ""

inherit rpm
