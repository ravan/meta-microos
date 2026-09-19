SUMMARY = "Sweden datum grids for Proj"
DESCRIPTION = "Sweden datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-se-9.8.1-2.3.noarch.rpm"
RPM_HASH = "11c32dd83f0145576b1abf35e1ad8b0e1ba8dd4d95187ded71dd63fdddf0c9c4466cd3486d038d662705361f6e76bd3255e1270da6aac6610259cd7a9103a96b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-se"

RDEPENDS:${PN} += ""

inherit rpm
