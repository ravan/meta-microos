SUMMARY = "Documentation for texlive-datetime2-french"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-french"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn56393"

RPM_NAME = "texlive-datetime2-french-doc-2026.226.1.03svn56393-59.2.noarch.rpm"
RPM_HASH = "beeb720e8b3726454737333cf7bfae85c231a660bc7c5df2ccccc6effc5bea0ce2b7fe8154dcaf9eb2da926866dd0095455ba86cb21ca3c99402d09d521c10ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-french-doc"

RDEPENDS:${PN} += ""

inherit rpm
