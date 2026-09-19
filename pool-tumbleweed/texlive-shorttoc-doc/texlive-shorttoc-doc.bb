SUMMARY = "Documentation for texlive-shorttoc"
DESCRIPTION = "This package includes the documentation for texlive-shorttoc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-shorttoc-doc-2026.226.1.3svn77682-60.2.noarch.rpm"
RPM_HASH = "b02d67a17df6be6ed144005c410ea5d2e4237c0a933f41cc8f390add5d1b46b23e504231d8279f20efe644b1205bba5d9c349c69f6b28d470e0208375fee09be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shorttoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
