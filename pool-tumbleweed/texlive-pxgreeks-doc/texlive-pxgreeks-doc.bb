SUMMARY = "Documentation for texlive-pxgreeks"
DESCRIPTION = "This package includes the documentation for texlive-pxgreeks"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-doc-2026.226.1.0svn21838-60.4.noarch.rpm"
RPM_HASH = "df8bb9fa586b5c3b1728fc6d5ef8cfb39f17081fbed97d919f0de2e872cefd47e5951775a1de0c2ff4565d44b7f58d34cb30da2235403f78e7b7fb5a038b3f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
