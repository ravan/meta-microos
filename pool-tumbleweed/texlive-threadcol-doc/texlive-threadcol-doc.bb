SUMMARY = "Documentation for texlive-threadcol"
DESCRIPTION = "This package includes the documentation for texlive-threadcol"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn28754"

RPM_NAME = "texlive-threadcol-doc-2026.227.1.0svn28754-62.2.noarch.rpm"
RPM_HASH = "1f3dc3318f6620cb8ca4039654cbc1f1eec157ba42feedd012870113734b5e78678e2e77c7a63a8ecf22542143e0c8355f2a138a7202ab57b8657c476c504953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-threadcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
