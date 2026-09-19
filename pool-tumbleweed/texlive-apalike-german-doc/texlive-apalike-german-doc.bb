SUMMARY = "Documentation for texlive-apalike-german"
DESCRIPTION = "This package includes the documentation for texlive-apalike-german"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-apalike-german-doc-2026.226.svn76790-61.2.noarch.rpm"
RPM_HASH = "d592cfbfd46d41802ba0684e8da133df6aa4eaa6a7dd5df0e8cce8657e17de98dc78922f2a932f24b206d03b09d002866397e379096073ecb3406a2948ffa1d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apalike-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
