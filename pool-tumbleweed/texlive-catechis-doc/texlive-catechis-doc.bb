SUMMARY = "Documentation for texlive-catechis"
DESCRIPTION = "This package includes the documentation for texlive-catechis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn59998"

RPM_NAME = "texlive-catechis-doc-2026.226.2.6svn59998-59.2.noarch.rpm"
RPM_HASH = "c41557aa89dc10584f7d2e6e9d6de64fe33077aec04a49d08581e39a15b9cc5e67845606734198ea22a7b89208f86008f5930f377b2c5469b965ab86db9f9196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catechis-doc"

RDEPENDS:${PN} += ""

inherit rpm
