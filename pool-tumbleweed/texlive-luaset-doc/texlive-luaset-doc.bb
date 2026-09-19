SUMMARY = "Documentation for texlive-luaset"
DESCRIPTION = "This package includes the documentation for texlive-luaset"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-luaset-doc-2026.226.1.1svn76924-59.2.noarch.rpm"
RPM_HASH = "6c66a84180d67bacad2834d8ce4eb51b492788386dd0c88fe164d0c651f77865d9fab0a3a3832ffe311603f3e3706224d4eff1f8e07041b37058118f5eedbc45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaset-doc"

RDEPENDS:${PN} += ""

inherit rpm
