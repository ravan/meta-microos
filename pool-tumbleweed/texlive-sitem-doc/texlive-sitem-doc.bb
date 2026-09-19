SUMMARY = "Documentation for texlive-sitem"
DESCRIPTION = "This package includes the documentation for texlive-sitem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn22136"

RPM_NAME = "texlive-sitem-doc-2026.226.1.0svn22136-64.2.noarch.rpm"
RPM_HASH = "6d8761ef7d966ec66a885efd24729a99a354e565803f4e3e9fed9b385a1271313004a87174f3fff9a7372ccd46fcb3d808457b3f2221b6f0d5f202e0b48a310f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
