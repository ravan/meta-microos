SUMMARY = "Documentation for texlive-lwarp"
DESCRIPTION = "This package includes the documentation for texlive-lwarp"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.921svn78111"

RPM_NAME = "texlive-lwarp-doc-2026.226.0.0.921svn78111-59.2.noarch.rpm"
RPM_HASH = "b451ff4fd3106fea22b76dfd3a8eb22aa3908c8bdae6a088d0c9260eecac3e4d9a2bfd4cb96978f52a059f3d4316ca040ad2f22ed6b3190d1c9c0a80c3e3a67a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lwarp-doc"

RDEPENDS:${PN} += ""

inherit rpm
