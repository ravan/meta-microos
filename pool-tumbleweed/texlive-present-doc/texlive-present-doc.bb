SUMMARY = "Documentation for texlive-present"
DESCRIPTION = "This package includes the documentation for texlive-present"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2.1svn50048"

RPM_NAME = "texlive-present-doc-2026.226.2.2.1svn50048-59.2.noarch.rpm"
RPM_HASH = "364e80bc1e5b5b432f9f008d05d49323af623f626dcc6cf26d9835885090a35d19587cd1419ae6e159797b45a09b297058aa7b9789f31e49b6f32986bd1151c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-present-doc"

RDEPENDS:${PN} += ""

inherit rpm
