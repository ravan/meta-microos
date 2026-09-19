SUMMARY = "Documentation for texlive-block"
DESCRIPTION = "This package includes the documentation for texlive-block"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn17209"

RPM_NAME = "texlive-block-doc-2026.226.svn17209-59.2.noarch.rpm"
RPM_HASH = "1d1d479dfa847161912b580f60530057078a7434e1ce506a237031e89e0e4279f58670f9a0eee3f1971e77fede96cbe49da43ca2f7859b176630d2c4b1bb1162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-block-doc"

RDEPENDS:${PN} += ""

inherit rpm
