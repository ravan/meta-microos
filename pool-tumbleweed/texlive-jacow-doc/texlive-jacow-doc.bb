SUMMARY = "Documentation for texlive-jacow"
DESCRIPTION = "This package includes the documentation for texlive-jacow"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.7svn63060"

RPM_NAME = "texlive-jacow-doc-2026.226.2.7svn63060-63.2.noarch.rpm"
RPM_HASH = "4501fa2d514e84607b889bc22ec362a9fa82f1f52c14274ee131785575eb7adf2e81e27d696d41d361209ddba4205b64f19d3a8a79a11fa125680aee58eb279d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jacow-doc"

RDEPENDS:${PN} += ""

inherit rpm
