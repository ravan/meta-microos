SUMMARY = "Documentation for texlive-biblatex-sbl"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-sbl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.15svn71470"

RPM_NAME = "texlive-biblatex-sbl-doc-2026.226.0.0.15svn71470-61.2.noarch.rpm"
RPM_HASH = "ec366c250c5a5aea6ed2eb8038c66dba3f8b962d606a27367e5c0678b7006aaae730d0fb3089e4673db3191d14a254951d2db84dbe0b32284e4f6d94c13864b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-sbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
