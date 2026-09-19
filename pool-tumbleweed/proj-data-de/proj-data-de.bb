SUMMARY = "Germany datum grids for Proj"
DESCRIPTION = "Germany datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.8.1"

RPM_NAME = "proj-data-de-9.8.1-2.3.noarch.rpm"
RPM_HASH = "7aabf7a4f5884e3e59c9b79e4a0beb7dcc874c232de7dc6a3296499e9c0a6ea8e6e8405a89ecb69011121dbb98aa8df064d56239cbc038c9744919828eb9ac00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-de"

RDEPENDS:${PN} += ""

inherit rpm
