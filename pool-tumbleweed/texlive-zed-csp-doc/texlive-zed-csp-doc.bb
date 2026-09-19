SUMMARY = "Documentation for texlive-zed-csp"
DESCRIPTION = "This package includes the documentation for texlive-zed-csp"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17258"

RPM_NAME = "texlive-zed-csp-doc-2026.226.svn17258-59.4.noarch.rpm"
RPM_HASH = "f8e2365251b325eb6cca4ecf57db875c4f2cebb6891dc13fa4787ab141123349ca66f49be7685b0c4d5c559513d845ff63514e0c41489760f7c941732847df69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zed-csp-doc"

RDEPENDS:${PN} += ""

inherit rpm
