SUMMARY = "German Online Banking Library"
DESCRIPTION = "A library of tools for German online banking implementing SEPA, IBAN/BIC, DETAUS and QIF."
LICENSE = "LGPL-3.0-only"

PV = "2.1.12"

RPM_NAME = "obantoo-2.1.12-5.7.noarch.rpm"
RPM_HASH = "f7406f7fe263931509fb8271ccecf18acd2926e05d07b3e7782a3d6a6827d94681397aa2e4883ec42a2f1a40aeb925f2f9fec85fc8edc81cf8abb3c502416dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obantoo"

RDEPENDS:${PN} += ""

inherit rpm
