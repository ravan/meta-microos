SUMMARY = "Documentation for texlive-marginfit"
DESCRIPTION = "This package includes the documentation for texlive-marginfit"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-marginfit-doc-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "b2353819029b086a859339635549424eae22a68787b3c7a76afd3dc1de8d84db269843c9f25ba720f5a3faa7a7d5c510943c292ad89890ec3cdee9ae46f0983b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginfit-doc"

RDEPENDS:${PN} += ""

inherit rpm
