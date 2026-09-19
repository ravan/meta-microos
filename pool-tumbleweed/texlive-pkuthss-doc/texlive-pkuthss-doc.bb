SUMMARY = "Documentation for texlive-pkuthss"
DESCRIPTION = "This package includes the documentation for texlive-pkuthss"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.4svn70491"

RPM_NAME = "texlive-pkuthss-doc-2026.226.1.9.4svn70491-58.2.noarch.rpm"
RPM_HASH = "7b5b0a712e58bb43745e75ec04f8daf4913c0326ef5ae157fc468556ebaf0067356ec015006abcec092851321bcd9afc81da2ac7360a6d6c51ff3975cd39e095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pkuthss-doc-zh \
texlive-pkuthss-doc"

RDEPENDS:${PN} += ""

inherit rpm
