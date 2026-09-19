SUMMARY = "Documentation for texlive-pst-graphicx"
DESCRIPTION = "This package includes the documentation for texlive-pst-graphicx"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn21717"

RPM_NAME = "texlive-pst-graphicx-doc-2026.226.0.0.02svn21717-59.2.noarch.rpm"
RPM_HASH = "39fd5102e2fc973a58d8d531cce949bfd2460fcfc1e5d65d3ddadc3a6a3d571d19cd954f241a47b49b9429c134876a56fdbd50c4dc52b713a135795e1aa07d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-graphicx-doc"

RDEPENDS:${PN} += ""

inherit rpm
