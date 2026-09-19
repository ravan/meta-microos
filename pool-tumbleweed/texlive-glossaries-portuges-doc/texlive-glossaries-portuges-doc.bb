SUMMARY = "Documentation for texlive-glossaries-portuges"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-portuges"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn36064"

RPM_NAME = "texlive-glossaries-portuges-doc-2026.226.1.1svn36064-60.4.noarch.rpm"
RPM_HASH = "11b8426bde9edb4570ab939c136446a282a568121690174ba1112bdb7ace8b3d0555ab4244da6fc44371bceeaddcac5d415791c8e0d38cf4a8cede0a4d6c415e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-portuges-doc"

RDEPENDS:${PN} += ""

inherit rpm
