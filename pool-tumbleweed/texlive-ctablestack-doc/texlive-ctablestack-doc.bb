SUMMARY = "Documentation for texlive-ctablestack"
DESCRIPTION = "This package includes the documentation for texlive-ctablestack"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-ctablestack-doc-2026.226.1.0svn78101-61.2.noarch.rpm"
RPM_HASH = "815c45ce68654880e1f3c0c8ff7b06f094543bd7538c35c9f77549890f28b7ee705272b035c68e6dd3fb7a2872bf99342a495276d89249119cc2fc76a04fa614"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctablestack-doc"

RDEPENDS:${PN} += ""

inherit rpm
