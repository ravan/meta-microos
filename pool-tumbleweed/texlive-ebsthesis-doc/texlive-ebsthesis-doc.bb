SUMMARY = "Documentation for texlive-ebsthesis"
DESCRIPTION = "This package includes the documentation for texlive-ebsthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-ebsthesis-doc-2026.226.1.0svn15878-61.4.noarch.rpm"
RPM_HASH = "6c408db94d30b373dab41446ba485d2483523958aa5593bd4a9a2cb4ab89e1c84a3ab400950dddb15673b9041796ca7192c84cfe67caff4891d10243dda14bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
