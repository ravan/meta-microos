SUMMARY = "Documentation for texlive-hep-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-font"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-font-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "d8f0d99a06c850c2dd469b30d8bad0e43f3bcbd695d6131dc4e52fa0f450b07b5debaec1b81e9caeb9fc8ea680197429199191116a3131411461b4722ca36d20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
