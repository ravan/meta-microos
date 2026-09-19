SUMMARY = "Documentation for texlive-everysel"
DESCRIPTION = "This package includes the documentation for texlive-everysel"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn57489"

RPM_NAME = "texlive-everysel-doc-2026.226.2.1svn57489-59.2.noarch.rpm"
RPM_HASH = "a4486fed4bc046ecae744181c3e130ee1fc713739dcf64b293e58fef2e7975ba5a848a770273e8823f0f73bfaeda451724cc481857fcccef78f2db3ec78add5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everysel-doc"

RDEPENDS:${PN} += ""

inherit rpm
