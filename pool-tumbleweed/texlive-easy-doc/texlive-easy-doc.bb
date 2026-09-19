SUMMARY = "Documentation for texlive-easy"
DESCRIPTION = "This package includes the documentation for texlive-easy"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.99svn19440"

RPM_NAME = "texlive-easy-doc-2026.226.0.0.99svn19440-61.4.noarch.rpm"
RPM_HASH = "c194da2dd1930032f4a12cb598ee46c51b9e7eb1e890a99dde0780c4f80b574a2b4f6965d97970b35e3e2e4774ab1cad2cfdf1fefa4e22af9d184a11fc3dfabc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easy-doc"

RDEPENDS:${PN} += ""

inherit rpm
