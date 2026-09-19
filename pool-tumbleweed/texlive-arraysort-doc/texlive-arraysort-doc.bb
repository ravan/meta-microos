SUMMARY = "Documentation for texlive-arraysort"
DESCRIPTION = "This package includes the documentation for texlive-arraysort"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn31576"

RPM_NAME = "texlive-arraysort-doc-2026.226.1.0svn31576-60.2.noarch.rpm"
RPM_HASH = "f1aec3685a2defde4876eaf44114a0360505440c68fe6028b15dcde776fc3b0bf4d03f2c4dbebccc22bf0008ec5781c8df90029da3734c1c58266fa35c6b4313"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arraysort-doc"

RDEPENDS:${PN} += ""

inherit rpm
