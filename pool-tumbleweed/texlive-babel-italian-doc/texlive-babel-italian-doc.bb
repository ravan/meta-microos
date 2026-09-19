SUMMARY = "Documentation for texlive-babel-italian"
DESCRIPTION = "This package includes the documentation for texlive-babel-italian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5.02svn77371"

RPM_NAME = "texlive-babel-italian-doc-2026.226.1.5.02svn77371-60.2.noarch.rpm"
RPM_HASH = "c6bcd6e22b475a5eabfba92f31268e4cfd559a1463d4dad3e7f3a26e6a6ff6f93501ae3a1871ce7f900f68cdf97814292e40b2bce9748d519a728f1416f33737"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
