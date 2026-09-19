SUMMARY = "Documentation for texlive-bondgraphs"
DESCRIPTION = "This package includes the documentation for texlive-bondgraphs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn36605"

RPM_NAME = "texlive-bondgraphs-doc-2026.226.1.0.1svn36605-59.2.noarch.rpm"
RPM_HASH = "7aa521faa2248b993487c9fe7611ea58ed099d7d4cb667377cd60632fbe6559b5a18612127e3b9def8925f2491689667e0a8f0476fbadc656aaa6d9ea2a52349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bondgraphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
