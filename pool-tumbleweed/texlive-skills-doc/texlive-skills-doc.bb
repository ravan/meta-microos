SUMMARY = "Documentation for texlive-skills"
DESCRIPTION = "This package includes the documentation for texlive-skills"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn56734"

RPM_NAME = "texlive-skills-doc-2026.226.1.0.0svn56734-64.2.noarch.rpm"
RPM_HASH = "9a3a9cd6638ddb3116b05d5c6b52a8e1584cc7fd0ba8a9f5935e7c065b9e47a7e4951a35090e6c4cddb1f4831187990d7f0f12f59647490c1f4dac10e4c4c946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skills-doc"

RDEPENDS:${PN} += ""

inherit rpm
