SUMMARY = "Documentation for texlive-amiri"
DESCRIPTION = "This package includes the documentation for texlive-amiri"
LICENSE = "OFL-1.1"

PV = "2026.226.1.000svn65191"

RPM_NAME = "texlive-amiri-doc-2026.226.1.000svn65191-61.2.noarch.rpm"
RPM_HASH = "b9bcb1116c6b170ba9fd8fe2c0bbb9e6ac3d2136631b1466ca577c3960d39fd8d7d4ff33d44de8077c5416d9659fea8f7f3e97e82e9d08d30ff12b1e00171576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-amiri-doc-ar \
texlive-amiri-doc"

RDEPENDS:${PN} += ""

inherit rpm
