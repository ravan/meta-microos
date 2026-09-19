SUMMARY = "Documentation for texlive-mathcommand"
DESCRIPTION = "This package includes the documentation for texlive-mathcommand"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.04svn76924"

RPM_NAME = "texlive-mathcommand-doc-2026.226.1.04svn76924-59.2.noarch.rpm"
RPM_HASH = "dd08ae36fa22184c61dc64d5c3ba0dc46fd8de602ba1d06cbfb48b9693529539cf4c99d2b1b327bccf3c41e56944b77422e038f5aa9beeb67ef244857fe7fe2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathcommand-doc"

RDEPENDS:${PN} += ""

inherit rpm
