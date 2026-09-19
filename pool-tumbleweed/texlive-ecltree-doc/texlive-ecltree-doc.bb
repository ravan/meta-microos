SUMMARY = "Documentation for texlive-ecltree"
DESCRIPTION = "This package includes the documentation for texlive-ecltree"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn15878"

RPM_NAME = "texlive-ecltree-doc-2026.226.1.1asvn15878-61.4.noarch.rpm"
RPM_HASH = "70bbbce2e64fb3f5742b5175f888dca49a57b679720c27aba5ec1afe474fe3aec1fb062fe1ddaf1f5ed885e200177c5b6ac1b5cd86dfaea90ec10475d81ec3ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecltree-doc"

RDEPENDS:${PN} += ""

inherit rpm
