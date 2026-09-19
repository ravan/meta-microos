SUMMARY = "Documentation for texlive-dithesis"
DESCRIPTION = "This package includes the documentation for texlive-dithesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn34295"

RPM_NAME = "texlive-dithesis-doc-2026.226.0.0.2svn34295-59.2.noarch.rpm"
RPM_HASH = "6364e753ecfc21587dc05aa02e99d6fc22904df0d29361a46dea47bcfd43ba8754b3ca14e5ced975eaddc172d93787f30775de6d8ec98c0a573064640ea5dd5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
