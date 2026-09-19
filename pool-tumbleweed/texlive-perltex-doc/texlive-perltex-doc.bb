SUMMARY = "Documentation for texlive-perltex"
DESCRIPTION = "This package includes the documentation for texlive-perltex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn73044"

RPM_NAME = "texlive-perltex-doc-2026.226.2.3svn73044-58.2.noarch.rpm"
RPM_HASH = "d106b24e1dbbf0e49b4645909539a7621e8617c798aacc1349d7a0b73477062b7aeca2e2c71d1338d641096f2bdbd5e31e20f85d02d1190595631f1425bdac46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-perltex.1 \
texlive-perltex-doc"

RDEPENDS:${PN} += ""

inherit rpm
