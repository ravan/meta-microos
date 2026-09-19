SUMMARY = "Documentation for texlive-genmpage"
DESCRIPTION = "This package includes the documentation for texlive-genmpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.1svn15878"

RPM_NAME = "texlive-genmpage-doc-2026.226.0.0.3.1svn15878-60.2.noarch.rpm"
RPM_HASH = "bc1449cbda6160128aa383ab788e4184113bfeac9a9849b88c7b7e2e0613dea78f5284c53964e4418068f5d47a99db6f6c012ede8144c587f18ce7977fe74bad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genmpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
