SUMMARY = "Logos for openSUSE Aeon"
DESCRIPTION = "Logos for openSUSE Aeon"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-Aeon-20250203-2.2.noarch.rpm"
RPM_HASH = "3daadcc11d20495298221327fd72ca6f60181529cfd0fae3907939d3bbf46a1d26b1071211fbf35747dda335812132a479990105572d2a49f1c64b2b4b271747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-Aeon"

RDEPENDS:${PN} += ""

inherit rpm
