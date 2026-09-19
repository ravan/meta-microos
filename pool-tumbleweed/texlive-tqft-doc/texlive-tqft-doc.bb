SUMMARY = "Documentation for texlive-tqft"
DESCRIPTION = "This package includes the documentation for texlive-tqft"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn71401"

RPM_NAME = "texlive-tqft-doc-2026.226.2.3svn71401-59.2.noarch.rpm"
RPM_HASH = "3b010f3ef70502e5e0a76ef92c61b4a9064ff79821ea691e5fdcbff0ea1dad2672e28ddd1a2821b20511d47dbb49ca71a3530f1d3883318661f8f29217124936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tqft-doc"

RDEPENDS:${PN} += ""

inherit rpm
