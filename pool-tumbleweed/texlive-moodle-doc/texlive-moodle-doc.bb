SUMMARY = "Documentation for texlive-moodle"
DESCRIPTION = "This package includes the documentation for texlive-moodle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn65672"

RPM_NAME = "texlive-moodle-doc-2026.226.1.0svn65672-61.2.noarch.rpm"
RPM_HASH = "2542b0574a84339d97b1b69c0736b8cbd6f3031ec2c4069ba9a2b90908f9c3e4088047c301cbabfd629a7a68e0a029770378b07e4431d03bcc281179e42fd628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moodle-doc"

RDEPENDS:${PN} += ""

inherit rpm
