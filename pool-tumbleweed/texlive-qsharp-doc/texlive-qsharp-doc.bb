SUMMARY = "Documentation for texlive-qsharp"
DESCRIPTION = "This package includes the documentation for texlive-qsharp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-doc-2026.226.0.0.3.1901.1401svn49722-60.4.noarch.rpm"
RPM_HASH = "476607a1e6ab61910abf61ffaa6b7c132e5ce5b05345af68c364736f9439292884e67e5ee55252e891e319480a07e1c048088b83ce6a48cc6ffed1ddeff8c03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qsharp-doc"

RDEPENDS:${PN} += ""

inherit rpm
