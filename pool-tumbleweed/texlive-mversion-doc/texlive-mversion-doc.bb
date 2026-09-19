SUMMARY = "Documentation for texlive-mversion"
DESCRIPTION = "This package includes the documentation for texlive-mversion"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn29370"

RPM_NAME = "texlive-mversion-doc-2026.226.1.0.1svn29370-61.2.noarch.rpm"
RPM_HASH = "517607a406d0c74839467d63a9ec1d198207c3cb142ad0299ff2256d888cae236549d31ff5601db4e94b5a120345a427ba38724717d92efaa04bbf708e067fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
