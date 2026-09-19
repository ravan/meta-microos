SUMMARY = "Documentation for texlive-cheatsheet"
DESCRIPTION = "This package includes the documentation for texlive-cheatsheet"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8svn45069"

RPM_NAME = "texlive-cheatsheet-doc-2026.226.0.0.8svn45069-60.2.noarch.rpm"
RPM_HASH = "6f59d2ce79d8df87c775077341b6954e315887a2166830671d68f3408089983cfbadfae9a7a7228b47b325b191d96b5ba5f5da03a0ddddd834790335c1bf3ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cheatsheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
