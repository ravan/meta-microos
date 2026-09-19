SUMMARY = "Logos for openSUSE MicroOS"
DESCRIPTION = "Logos for openSUSE MicroOS"
LICENSE = "CC-BY-SA-4.0"

PV = "20250203"

RPM_NAME = "distribution-logos-openSUSE-MicroOS-20250203-2.2.noarch.rpm"
RPM_HASH = "a484e3c2e5e3ce12f8ce0dd7e4f7e4ff1d738dad7ae6d6176bef064852a44b1c58f8254c3ef0740043e37d1b16a044f3b6752732652f8027b26bab22e2f09764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "distribution-logos \
distribution-logos-openSUSE-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
