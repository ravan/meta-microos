SUMMARY = "Documentation for texlive-uptex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-uptex-fonts"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn74119"

RPM_NAME = "texlive-uptex-fonts-doc-2026.226.svn74119-60.2.noarch.rpm"
RPM_HASH = "111f68fba92b6f0f6b4ab815056d3be3956e772f10760212546b51fc8a99ecd77feb623029b1c782d458d99ef79de12b9d54468e9da1c5e1a2f832d6dae87e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uptex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
