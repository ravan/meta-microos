SUMMARY = "Documentation for texlive-na-box"
DESCRIPTION = "This package includes the documentation for texlive-na-box"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn45130"

RPM_NAME = "texlive-na-box-doc-2026.226.1.0svn45130-61.2.noarch.rpm"
RPM_HASH = "3fe2beb83bf94e67aade78f7454fc50a9fc2e373bf4ea402713b67c5e79a3cffba4865821afccc1cbe073b2fb8dc90fbe5691d3a241abb1f248e4334213ea317"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-na-box-doc-ar \
texlive-na-box-doc"

RDEPENDS:${PN} += ""

inherit rpm
