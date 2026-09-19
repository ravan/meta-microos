SUMMARY = "Documentation for texlive-babel-russian"
DESCRIPTION = "This package includes the documentation for texlive-babel-russian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3msvn57376"

RPM_NAME = "texlive-babel-russian-doc-2026.226.1.3msvn57376-60.2.noarch.rpm"
RPM_HASH = "d756193d16824cac06a36db322e149e3ad74ed29b4dcba172c5c89326eb15e6bf11327262fc568ee07a49957ba2167931ff617cb56e63a49cc14802a39538bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-russian-doc"

RDEPENDS:${PN} += ""

inherit rpm
