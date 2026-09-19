SUMMARY = "Documentation for texlive-gmdoc"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.993svn21292"

RPM_NAME = "texlive-gmdoc-doc-2026.226.0.0.993svn21292-60.4.noarch.rpm"
RPM_HASH = "c04d557ebfdcef600af76642217686b1ba0311d99333b324c06dbd424c5cc203f3d0cff6906ffef0b9aa64291ac61547837857958a6d74f0ccca8d24a1f1b9fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
