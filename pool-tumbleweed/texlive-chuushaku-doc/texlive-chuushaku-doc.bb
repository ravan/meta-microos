SUMMARY = "Documentation for texlive-chuushaku"
DESCRIPTION = "This package includes the documentation for texlive-chuushaku"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn73263"

RPM_NAME = "texlive-chuushaku-doc-2026.226.1.0.1svn73263-60.2.noarch.rpm"
RPM_HASH = "dc437f7da770defba1ce0f7aff9c73d0d625f7216b5c1650e9ea3f22bb3efda929b65a3d7fd55d013a53fd449cd8241c4e6e16a8d867d3579430fd00ee71fafc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chuushaku-doc-ja \
texlive-chuushaku-doc"

RDEPENDS:${PN} += ""

inherit rpm
