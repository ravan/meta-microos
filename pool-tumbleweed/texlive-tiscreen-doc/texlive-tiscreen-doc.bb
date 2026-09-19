SUMMARY = "Documentation for texlive-tiscreen"
DESCRIPTION = "This package includes the documentation for texlive-tiscreen"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62602"

RPM_NAME = "texlive-tiscreen-doc-2026.226.svn62602-59.2.noarch.rpm"
RPM_HASH = "e93079c209d3c0b6ec157a398969f6dcc6f41e09576b94dac496e3fda95a32fea49f29ef84638dee9eca12961d7ecd6985739a329208065c1bafa8c268c5b39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tiscreen-doc"

RDEPENDS:${PN} += ""

inherit rpm
