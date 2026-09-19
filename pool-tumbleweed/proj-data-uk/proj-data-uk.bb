SUMMARY = "United Kingdom datum grids for Proj"
DESCRIPTION = "United Kingdom datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-uk-9.8.1-2.3.noarch.rpm"
RPM_HASH = "f2badfc71373519b522a99b70cc2ba1255e2f285b4d7bbd52bd6005bdce26a70e84df81ff7014ea59b470bb49f41643f44cac77b9248e96f1de608a3229b2ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-uk"

RDEPENDS:${PN} += ""

inherit rpm
