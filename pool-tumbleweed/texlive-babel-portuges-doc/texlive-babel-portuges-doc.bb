SUMMARY = "Documentation for texlive-babel-portuges"
DESCRIPTION = "This package includes the documentation for texlive-babel-portuges"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2usvn77682"

RPM_NAME = "texlive-babel-portuges-doc-2026.226.1.2usvn77682-60.2.noarch.rpm"
RPM_HASH = "eb72ac02022a815fe9bb30ac07484f97f571beef244c1612fd346d31d814229069de765e346caf6be86e1da8a5d4bf77743bfac0575904653aeb63d8dfb42a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
