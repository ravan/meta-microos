SUMMARY = "Hungary datum grids for Proj"
DESCRIPTION = "Hungary datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-hu-9.8.1-2.3.noarch.rpm"
RPM_HASH = "0f3c9f727ece631948fa93be5ebf1cb5b273ff80aef0ca98972402e1c620406b7adbd9c4be7220b633b369efc6baefba13c5a45fd609b8e052cdef8c61da8076"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-hu"

RDEPENDS:${PN} += ""

inherit rpm
