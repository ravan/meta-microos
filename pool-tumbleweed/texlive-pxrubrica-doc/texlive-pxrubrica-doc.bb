SUMMARY = "Documentation for texlive-pxrubrica"
DESCRIPTION = "This package includes the documentation for texlive-pxrubrica"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-doc-2026.226.1.3esvn66298-60.4.noarch.rpm"
RPM_HASH = "68e600fc8c75e0ad17491d7634503abcdd4605746159184140fd3e3646abba1b35bd286719c13ac61daef06e5e862d8215e5f24ce9e499c7e5c6c3a76a4c4689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxrubrica-doc-ja \
texlive-pxrubrica-doc"

RDEPENDS:${PN} += ""

inherit rpm
