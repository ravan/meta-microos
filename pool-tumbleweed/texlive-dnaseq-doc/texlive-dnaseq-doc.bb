SUMMARY = "Documentation for texlive-dnaseq"
DESCRIPTION = "This package includes the documentation for texlive-dnaseq"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn17194"

RPM_NAME = "texlive-dnaseq-doc-2026.226.0.0.01svn17194-59.2.noarch.rpm"
RPM_HASH = "6a046d76c818e860cff320db1b72e96b115e1b788c0da2a82c18aa9ba5b643670e99f67bb3f5aed74b764af93f0e44aba7ae33ad7216921c13677131e8ebc261"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dnaseq-doc"

RDEPENDS:${PN} += ""

inherit rpm
