SUMMARY = "Documentation for texlive-kblocks"
DESCRIPTION = "This package includes the documentation for texlive-kblocks"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn57617"

RPM_NAME = "texlive-kblocks-doc-2026.226.2.0svn57617-63.2.noarch.rpm"
RPM_HASH = "a447af2fb7af07528601ff28dd97f8b562429730976b03eaeac0170f03a7eb3edc5d625960336d15fa369474c536ff7533a76baefdccb5e91a8ab07db0ef2f50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kblocks-doc"

RDEPENDS:${PN} += ""

inherit rpm
