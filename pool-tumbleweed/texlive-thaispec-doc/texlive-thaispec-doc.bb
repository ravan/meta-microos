SUMMARY = "Documentation for texlive-thaispec"
DESCRIPTION = "This package includes the documentation for texlive-thaispec"
LICENSE = "LPPL-1.0"

PV = "2026.227.2021.03.01svn77682"

RPM_NAME = "texlive-thaispec-doc-2026.227.2021.03.01svn77682-62.2.noarch.rpm"
RPM_HASH = "f1f64535d5b90aaa70bba892e9d7f50c6d7207e1abba4d8f718eef7aa02a62fda352dff862e050f50eeecaf953d6fe56380ba81fb0ecbd09d7a7036f49e36441"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-thaispec-doc-th \
texlive-thaispec-doc"

RDEPENDS:${PN} += ""

inherit rpm
