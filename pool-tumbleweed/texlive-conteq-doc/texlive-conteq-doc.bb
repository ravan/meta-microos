SUMMARY = "Documentation for texlive-conteq"
DESCRIPTION = "This package includes the documentation for texlive-conteq"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn37868"

RPM_NAME = "texlive-conteq-doc-2026.226.0.0.1.1svn37868-61.2.noarch.rpm"
RPM_HASH = "c53191954e46c7f2acf2431f27bcceb56b33c57eb225927b0ff3088f6f11c0589b36222613add19a3698896666a580dece7c163e3102ff791eb350bf7da924db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conteq-doc"

RDEPENDS:${PN} += ""

inherit rpm
