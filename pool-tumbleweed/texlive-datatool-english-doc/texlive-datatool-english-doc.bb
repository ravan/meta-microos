SUMMARY = "Documentation for texlive-datatool-english"
DESCRIPTION = "This package includes the documentation for texlive-datatool-english"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn74590"

RPM_NAME = "texlive-datatool-english-doc-2026.226.1.1svn74590-61.2.noarch.rpm"
RPM_HASH = "16521387719933a237e1f14dfcbe1a504b12c1cce771be1389f54fc49fcdad4fcc83adfc1ac282a65666bd836a0fe33c41cd2ddbaf382c37e6ad89bf9e6eacfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datatool-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
