SUMMARY = "Documentation for texlive-gustlib"
DESCRIPTION = "This package includes the documentation for texlive-gustlib"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-gustlib-doc-2026.226.svn54074-60.4.noarch.rpm"
RPM_HASH = "7c9ace2fb30a54504481ea3adc39ba2f01064b69f20ee15c76d901be82af66db4699186e9fdc3ab0247eb33bac32efeb801324243bc9ed30dfef40f3e9ae87d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gustlib-doc"

RDEPENDS:${PN} += ""

inherit rpm
