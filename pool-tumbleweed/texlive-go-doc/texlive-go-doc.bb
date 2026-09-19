SUMMARY = "Documentation for texlive-go"
DESCRIPTION = "This package includes the documentation for texlive-go"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-go-doc-2026.226.svn78101-60.4.noarch.rpm"
RPM_HASH = "bb76dcab3f787544d4a9830f4524be273a768d2a1a24b113cdb24d0f84685bf4a21498c2e1f1ad6c5d41fefaf1ceb3f2bc6714e88d22812eb2480844bd858536"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-go-doc"

RDEPENDS:${PN} += ""

inherit rpm
