SUMMARY = "Documentation for texlive-oswald"
DESCRIPTION = "This package includes the documentation for texlive-oswald"
LICENSE = "OFL-1.1"

PV = "2026.226.svn60784"

RPM_NAME = "texlive-oswald-doc-2026.226.svn60784-61.2.noarch.rpm"
RPM_HASH = "5d3c3644eacd4b9ab99af6d8283250202951a675b7a8c6f41b8c896cfc1702374eb914d6da8982bfdd0cac3a4b3605edad058fa6e4a7e00f9aa97442326e8f16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oswald-doc"

RDEPENDS:${PN} += ""

inherit rpm
