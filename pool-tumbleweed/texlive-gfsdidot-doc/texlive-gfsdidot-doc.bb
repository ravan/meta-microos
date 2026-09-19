SUMMARY = "Documentation for texlive-gfsdidot"
DESCRIPTION = "This package includes the documentation for texlive-gfsdidot"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-gfsdidot-doc-2026.226.svn77682-60.2.noarch.rpm"
RPM_HASH = "0da2cf75851aed1d70c9dd981d5f51c8567b860a40a3e25453999ebc8ff654f86eb224824a3f4bb089f8ecbfdfd4838939bc159d52876eaf38de14e6d4a21beb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsdidot-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
