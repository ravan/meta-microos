SUMMARY = "Documentation for texlive-theanooldstyle"
DESCRIPTION = "This package includes the documentation for texlive-theanooldstyle"
LICENSE = "OFL-1.1"

PV = "2026.227.svn64519"

RPM_NAME = "texlive-theanooldstyle-doc-2026.227.svn64519-62.2.noarch.rpm"
RPM_HASH = "163c58482c8fe3524306e272074d023a4095bf91ea80a7a38c0f745c16c3dcced8c08fac7f4843cf338388cbd254f3e6cd6a07a7229b4493769172e26fceaccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanooldstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
