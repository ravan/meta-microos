SUMMARY = "Documentation for texlive-manfnt"
DESCRIPTION = "This package includes the documentation for texlive-manfnt"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-manfnt-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "9d63798dabbcf7a21b8eeef351fec37f9c63d81b6296a1ec39bf2cfb7dc3a4c2f66edcd0ab8016ec79fc4510142bef2a6cc089e9fa3aaf257ad7e565a167316f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manfnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
