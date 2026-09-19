SUMMARY = "Documentation for texlive-embedfile"
DESCRIPTION = "This package includes the documentation for texlive-embedfile"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.13svn77682"

RPM_NAME = "texlive-embedfile-doc-2026.226.2.13svn77682-61.4.noarch.rpm"
RPM_HASH = "2572f3271482a78003aeb8c8fa0509d2c52a2881436f7cff45470684d94490178f972033ce63bc61af3698b06b2c8bb0fd37521294043c115b96c9e8f0257b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
