SUMMARY = "Documentation for texlive-phfextendedabstract"
DESCRIPTION = "This package includes the documentation for texlive-phfextendedabstract"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn60732"

RPM_NAME = "texlive-phfextendedabstract-doc-2026.226.1.0svn60732-58.2.noarch.rpm"
RPM_HASH = "622636f7b875c33ec2c8769808db2484daafab66598352e034514994cd63fa6bd7cbf33915ba3b9633a4f4834327b5890134d546a7489405d355661baeddf752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfextendedabstract-doc"

RDEPENDS:${PN} += ""

inherit rpm
