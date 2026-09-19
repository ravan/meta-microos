SUMMARY = "Documentation for texlive-metrix"
DESCRIPTION = "This package includes the documentation for texlive-metrix"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76924"

RPM_NAME = "texlive-metrix-doc-2026.226.1.5svn76924-61.2.noarch.rpm"
RPM_HASH = "052f98c8793c525c4e8ef6813e974ddf4a93ceff991af1cafc146d6d28c9e79bb5cd31610073d08d72d76b270109a15b6db2120d82ae688cb01e511e8f915349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
