SUMMARY = "Documentation for texlive-jmlr"
DESCRIPTION = "This package includes the documentation for texlive-jmlr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.30svn61957"

RPM_NAME = "texlive-jmlr-doc-2026.226.1.30svn61957-63.2.noarch.rpm"
RPM_HASH = "2ec76c51a0f291bfe08e8ec74a2736fb448596957e229290ea9548b665dad81906c77c005f8351d656da967b978dc1a47a6dce24c199aea7eb767db12631685a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jmlr-doc"

RDEPENDS:${PN} += ""

inherit rpm
