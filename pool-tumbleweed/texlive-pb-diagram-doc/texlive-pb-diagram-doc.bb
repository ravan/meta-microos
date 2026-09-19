SUMMARY = "Documentation for texlive-pb-diagram"
DESCRIPTION = "This package includes the documentation for texlive-pb-diagram"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0svn15878"

RPM_NAME = "texlive-pb-diagram-doc-2026.226.5.0svn15878-58.2.noarch.rpm"
RPM_HASH = "9f806ea94bf6954c8f8166a7ce55bbd7a22f79f2da67a97ff22c8edcdab9e6b3ba2743865fc1d7a8f70599e42dc7671c25257ee44952602f2c2df46819ac3a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pb-diagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
