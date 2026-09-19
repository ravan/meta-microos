SUMMARY = "Documentation for texlive-bitpattern"
DESCRIPTION = "This package includes the documentation for texlive-bitpattern"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn39073"

RPM_NAME = "texlive-bitpattern-doc-2026.226.svn39073-59.2.noarch.rpm"
RPM_HASH = "7d813ff54c1554b2c71a5236361a7879bbaa04d008ae08aefd24e5540c2791fd85f2d0fa0847b4b339fe6d5ac74c5588571acd56bbadb4f1c2e62146c8cc7163"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitpattern-doc"

RDEPENDS:${PN} += ""

inherit rpm
