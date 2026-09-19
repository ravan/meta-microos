SUMMARY = "Documentation for texlive-bracketkey"
DESCRIPTION = "This package includes the documentation for texlive-bracketkey"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17129"

RPM_NAME = "texlive-bracketkey-doc-2026.226.1.0svn17129-59.2.noarch.rpm"
RPM_HASH = "5ee29361602c13d8867222d3c34bae2a99b4e304542c98d94ef77fcf38d6a1b2b4d944427fd484c20237ba1081e855afe2e36cae77a486545a270c1afa65b693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bracketkey-doc"

RDEPENDS:${PN} += ""

inherit rpm
