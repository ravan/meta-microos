SUMMARY = "Documentation for texlive-xyling"
DESCRIPTION = "This package includes the documentation for texlive-xyling"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-xyling-doc-2026.226.1.1svn15878-59.4.noarch.rpm"
RPM_HASH = "db825ad68e89316d67226bf510eee723c3b4e507396fe635c93fa0713b69ef6d19a0d4e5ae074f113989311a60321b0239fbeb0d1815bef79c0a75929deeed2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xyling-doc-en \
texlive-xyling-doc"

RDEPENDS:${PN} += ""

inherit rpm
