SUMMARY = "Documentation for texlive-unravel"
DESCRIPTION = "This package includes the documentation for texlive-unravel"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3csvn77682"

RPM_NAME = "texlive-unravel-doc-2026.226.0.0.3csvn77682-60.2.noarch.rpm"
RPM_HASH = "57b23ea3e4d8b1b453326d154d77e21f46169c4cf1e108d468e6c6d9d33b3da9d34f2a9275b2ad3422f12ef549e05d738e21e0dc7cd79650e23b855ea3001357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unravel-doc"

RDEPENDS:${PN} += ""

inherit rpm
