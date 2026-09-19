SUMMARY = "Documentation for texlive-ipsum"
DESCRIPTION = "This package includes the documentation for texlive-ipsum"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn75788"

RPM_NAME = "texlive-ipsum-doc-2026.226.0.0.1.3svn75788-63.2.noarch.rpm"
RPM_HASH = "364c8d19f576688e35aef1313da4937c2bed578bb038d2866229b4f80d832c9389ebee39485a1865055065e0ab885cb9df8681c8cb4ae152769fe7dfc5f0baf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
