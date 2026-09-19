SUMMARY = "Documentation for texlive-njurepo"
DESCRIPTION = "This package includes the documentation for texlive-njurepo"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn50492"

RPM_NAME = "texlive-njurepo-doc-2026.226.1.1.2svn50492-61.2.noarch.rpm"
RPM_HASH = "57b25daa82856c8feaa27933e87660a91d9f78c77b737ce5296c113da6eb2e2c45b1599587e107ec6f7e555d4728bcca0ddbc6e1601c4a148b27b899b5e80603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-njurepo-doc"

RDEPENDS:${PN} += ""

inherit rpm
