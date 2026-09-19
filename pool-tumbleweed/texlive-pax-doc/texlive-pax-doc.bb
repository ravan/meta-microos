SUMMARY = "Documentation for texlive-pax"
DESCRIPTION = "This package includes the documentation for texlive-pax"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63509"

RPM_NAME = "texlive-pax-doc-2026.226.svn63509-58.2.noarch.rpm"
RPM_HASH = "634fe26117951cabfc581ae8ada0d67eb87c0b39c555ce871680a1d155ac2a87b1fa051483b2281057afe45c193f3f62a68e24217ad95378d01a9be3f8e91f72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pax-doc"

RDEPENDS:${PN} += ""

inherit rpm
