SUMMARY = "Documentation for texlive-gradient-text"
DESCRIPTION = "This package includes the documentation for texlive-gradient-text"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-gradient-text-doc-2026.226.1.2svn76924-60.4.noarch.rpm"
RPM_HASH = "ac9a4e17c6348f2b13d032281eab6b180cb82517287c85f05ffbd85c66d6e5a763c83d985ec69fa3936b5e90bcbf8daa12f11d38e7cee3a59e48c7d4a743f2a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradient-text-doc"

RDEPENDS:${PN} += ""

inherit rpm
