SUMMARY = "Documentation for texlive-beilstein"
DESCRIPTION = "This package includes the documentation for texlive-beilstein"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn56193"

RPM_NAME = "texlive-beilstein-doc-2026.226.2.1svn56193-61.2.noarch.rpm"
RPM_HASH = "f99e34a22cf7ac501d28b592b57daf120a19a31630b2baa7311f4c5c2d30dab6c80d7ab5dd59190da02c0d8902da2505686d79a3b71655e7aec8f6240eff8ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beilstein-doc"

RDEPENDS:${PN} += ""

inherit rpm
