SUMMARY = "Documentation for texlive-manyind"
DESCRIPTION = "This package includes the documentation for texlive-manyind"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn49874"

RPM_NAME = "texlive-manyind-doc-2026.226.svn49874-59.2.noarch.rpm"
RPM_HASH = "5df942d9a395bdc78a2e9bd784c6b5a42e10cf5cd5d502325a5de49b795b34352ac97bfa79bfa629f9630177a68464287408c3396ab6ca2660a4ecd7259bf932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manyind-doc"

RDEPENDS:${PN} += ""

inherit rpm
