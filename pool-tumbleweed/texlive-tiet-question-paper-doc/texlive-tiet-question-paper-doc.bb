SUMMARY = "Documentation for texlive-tiet-question-paper"
DESCRIPTION = "This package includes the documentation for texlive-tiet-question-paper"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn71601"

RPM_NAME = "texlive-tiet-question-paper-doc-2026.227.svn71601-62.2.noarch.rpm"
RPM_HASH = "828c1ec1a68eca841cd531c67682750c93b3040bc8a2b7b945d3c8a25abe3c21b6379fda35be5a510a38283e6f7ca03cf2a7c31ece1db3c020e2f49097c1e72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tiet-question-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
