SUMMARY = "Documentation for texlive-erdc"
DESCRIPTION = "This package includes the documentation for texlive-erdc"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-erdc-doc-2026.226.1.1svn15878-61.4.noarch.rpm"
RPM_HASH = "fd468299c259cee3eda504ef401d9b97f52ffe6c8eb57c350398c72d1f12cafdccb81684488f494f0371332f07afe3daa0cd42568ad0ea0fed3000486c533a3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erdc-doc"

RDEPENDS:${PN} += ""

inherit rpm
