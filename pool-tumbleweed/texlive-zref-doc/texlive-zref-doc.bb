SUMMARY = "Documentation for texlive-zref"
DESCRIPTION = "This package includes the documentation for texlive-zref"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.36svn78101"

RPM_NAME = "texlive-zref-doc-2026.226.2.36svn78101-59.4.noarch.rpm"
RPM_HASH = "814d81ab5bdcdcaea3fec9d25ec88e4cbe8d4538a35e0b04bc333dc37958321d785acc39a20c8646c583a1027cb36245d29f44df5756bd9564a8720c66998220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
