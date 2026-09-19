SUMMARY = "Documentation for texlive-aboensis"
DESCRIPTION = "This package includes the documentation for texlive-aboensis"
LICENSE = "OFL-1.1"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-aboensis-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "8fae965ffdfe04541ce2a779950cc6ac929ae84fad476c70a6cab398b30109343643c87369b7255f441c5ab7da3fdae0f91feda1cefd936bc6787fdb1359f60e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aboensis-doc"

RDEPENDS:${PN} += ""

inherit rpm
