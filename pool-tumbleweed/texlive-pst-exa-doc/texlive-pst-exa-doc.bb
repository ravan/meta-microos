SUMMARY = "Documentation for texlive-pst-exa"
DESCRIPTION = "This package includes the documentation for texlive-pst-exa"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.06svn45289"

RPM_NAME = "texlive-pst-exa-doc-2026.226.0.0.06svn45289-59.2.noarch.rpm"
RPM_HASH = "29551a09eaf6680706efad7eb98756816eb9a14ebcbdbe3d6598e1b154d0fb3931b79343138faae31410f940540deb98321d7f4a2bed8a787f13812f2f92812b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-exa-doc"

RDEPENDS:${PN} += ""

inherit rpm
