SUMMARY = "Austria datum grids for Proj"
DESCRIPTION = "Austria datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-at-9.8.1-2.3.noarch.rpm"
RPM_HASH = "584cc09d6d84ac709d615ff34b837868989a881ac59cbc8e7fb3ee98429688cafb2b4db539235d1f7a26b40164d9b73495b074aac62770c3e7b1f8eaa5a0b3d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-at"

RDEPENDS:${PN} += ""

inherit rpm
