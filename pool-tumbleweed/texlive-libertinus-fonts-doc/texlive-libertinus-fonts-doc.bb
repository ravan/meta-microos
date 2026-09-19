SUMMARY = "Documentation for texlive-libertinus-fonts"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-fonts"
LICENSE = "OFL-1.1"

PV = "2026.226.7.051svn72484"

RPM_NAME = "texlive-libertinus-fonts-doc-2026.226.7.051svn72484-61.2.noarch.rpm"
RPM_HASH = "266f899342c5bb5eacfd19294a8e2185700aa3119c500fd333d55357c81c3fbec4e72d9e69083868a1ee87e374f1620a3f7f68ab560787e41d8b6cd1a342e19a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
