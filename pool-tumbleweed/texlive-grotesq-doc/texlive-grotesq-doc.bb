SUMMARY = "Documentation for texlive-grotesq"
DESCRIPTION = "This package includes the documentation for texlive-grotesq"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn35859"

RPM_NAME = "texlive-grotesq-doc-2026.226.svn35859-60.4.noarch.rpm"
RPM_HASH = "4e3025bded47cf876d227a0b90e1ba9271ce8cade20929f55caabe21a89611888a592a5078e2ce13850c22eb99dd8321646bbf1d25dcea348589513287aa860f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grotesq-doc"

RDEPENDS:${PN} += ""

inherit rpm
