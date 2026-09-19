SUMMARY = "Documentation for texlive-mismath"
DESCRIPTION = "This package includes the documentation for texlive-mismath"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.2svn76547"

RPM_NAME = "texlive-mismath-doc-2026.226.3.2svn76547-61.2.noarch.rpm"
RPM_HASH = "3353396b57aa852f8b78c611513f23f70cebfaf84bd143eaf920da764dfc2cb651b9138b15d9935171f9c0b2ef87cfeeb7d6a867ab19aaa8fb6e70fb07519509"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mismath-doc"

RDEPENDS:${PN} += ""

inherit rpm
