SUMMARY = "Documentation for texlive-newtx"
DESCRIPTION = "This package includes the documentation for texlive-newtx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.756svn78101"

RPM_NAME = "texlive-newtx-doc-2026.226.1.756svn78101-61.2.noarch.rpm"
RPM_HASH = "c8671bf9861b81bdd66545ea2d0e288be4d5809555ee3e69f844abfe115a5e60952e9f133816f097edbc63e4ffaa26267fc33e34f384a638be024cef3a93c5ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
