SUMMARY = "United States datum grids for Proj"
DESCRIPTION = "United States datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-us-9.8.1-2.3.noarch.rpm"
RPM_HASH = "be28e655431557e0bdb5187799aadc2d6af09e31a66efa5294a3eea8380b7fcca4ec3107541bf54fe2caaef8dab986a25911a9a669be1851e8e47be171195eaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-us"

RDEPENDS:${PN} += ""

inherit rpm
