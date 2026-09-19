SUMMARY = "Documentation for texlive-datetime2-polish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-polish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn48456"

RPM_NAME = "texlive-datetime2-polish-doc-2026.226.1.1svn48456-59.2.noarch.rpm"
RPM_HASH = "fb805330f5ea61d7363d35edf6bed22ef7a4262708ba29a05fb0362570e18ae8a5386b253f86f2098f21a20dd0fa2617bb12ec86492a7157fee530d5c774ef11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
