SUMMARY = "Documentation for texlive-pst-3dplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-3dplot"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.09svn68727"

RPM_NAME = "texlive-pst-3dplot-doc-2026.226.2.09svn68727-59.2.noarch.rpm"
RPM_HASH = "e3f89d3fd23f12e758ae337b911c18eef06766fd0ae2a6154c99ac03fc96ff3bbb19a7ab9f225c78ebdf86dd9dffa30edb1d1f075eff3cd9e3c63f1e5f779aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-3dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
