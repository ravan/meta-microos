SUMMARY = "Documentation for texlive-gitfile-info"
DESCRIPTION = "This package includes the documentation for texlive-gitfile-info"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn51928"

RPM_NAME = "texlive-gitfile-info-doc-2026.226.0.0.5svn51928-60.4.noarch.rpm"
RPM_HASH = "b0e242ab35c11d6e786d51d58a1688ff43460072454d246e1313201c02f7cf85ce1fcb4ff324bb9a339b9275fda0f88688cf45523363d263af00bee92e251c7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitfile-info-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
