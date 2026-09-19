SUMMARY = "Documentation for texlive-vpe"
DESCRIPTION = "This package includes the documentation for texlive-vpe"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn26039"

RPM_NAME = "texlive-vpe-doc-2026.226.0.0.2svn26039-60.2.noarch.rpm"
RPM_HASH = "4984bfd601dddac37c23e749a96abfbcd7093251f20772d8326fbbc923b15bde72cab1926e44c7c5c0ba5c9a4368152ae819c2a97aba47635f995463d278794f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
