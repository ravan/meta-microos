SUMMARY = "Documentation for texlive-program"
DESCRIPTION = "This package includes the documentation for texlive-program"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.3.14svn44214"

RPM_NAME = "texlive-program-doc-2026.226.3.3.14svn44214-59.2.noarch.rpm"
RPM_HASH = "183047a451f692a7a63d6be4c93646cecd6daf0663c712225605a63262a0760de7c8c2a1a968abd6e25f9a5b31660c3c7d50c4f727b546b1b89ba0dfe7741983"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-program-doc"

RDEPENDS:${PN} += ""

inherit rpm
