SUMMARY = "Documentation for texlive-mwcls"
DESCRIPTION = "This package includes the documentation for texlive-mwcls"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.77svn77050"

RPM_NAME = "texlive-mwcls-doc-2026.226.0.0.77svn77050-61.2.noarch.rpm"
RPM_HASH = "641f5d17534d3be552e0ad6e88db1c0412bb6373a147caf447c271ec369d0bdbf0c9e45588b6c59acdb4f2c8e2f50140b04daeab1e6804fdeb9afc50c4fde3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mwcls-doc-pl \
texlive-mwcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
