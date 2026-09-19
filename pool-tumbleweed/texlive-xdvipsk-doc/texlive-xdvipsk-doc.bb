SUMMARY = "Documentation for texlive-xdvipsk"
DESCRIPTION = "This package includes the documentation for texlive-xdvipsk"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77931"

RPM_NAME = "texlive-xdvipsk-doc-2026.226.svn77931-59.4.noarch.rpm"
RPM_HASH = "225d2e787bf76a0880d754df66fa76c9530898234d172bdca31d00a150bc8490debf2f09e2171875bd1dfe232e9212c9442934853a3f4e8b5f6b0fd1c32af16c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-xdvipsk.1 \
texlive-xdvipsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
