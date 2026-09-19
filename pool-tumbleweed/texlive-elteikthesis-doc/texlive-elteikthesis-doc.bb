SUMMARY = "Documentation for texlive-elteikthesis"
DESCRIPTION = "This package includes the documentation for texlive-elteikthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn71087"

RPM_NAME = "texlive-elteikthesis-doc-2026.226.2.4svn71087-61.4.noarch.rpm"
RPM_HASH = "fdd81fd18bbbfdccfd8992c25c76630cae0fc627401ba0aa67b1caefeda140fc835f577358e618d9577ad9918db05810246778179ad13f794c88adc6e44f272d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elteikthesis-doc-en;hu \
texlive-elteikthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
