SUMMARY = "Documentation for texlive-pxufont"
DESCRIPTION = "This package includes the documentation for texlive-pxufont"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7svn77682"

RPM_NAME = "texlive-pxufont-doc-2026.226.0.0.7svn77682-60.4.noarch.rpm"
RPM_HASH = "d88be88c5c3afd89a57aba3aca60884764316e3ec7eed34abb26d11adf86ce446b7af6e85431cdbb27ae28191f305a695ff22fbf2f3e4de75860efe9dfb85244"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxufont-doc"

RDEPENDS:${PN} += ""

inherit rpm
