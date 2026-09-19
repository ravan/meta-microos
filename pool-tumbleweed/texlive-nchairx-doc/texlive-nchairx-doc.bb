SUMMARY = "Documentation for texlive-nchairx"
DESCRIPTION = "This package includes the documentation for texlive-nchairx"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn60196"

RPM_NAME = "texlive-nchairx-doc-2026.226.1.0.0svn60196-61.2.noarch.rpm"
RPM_HASH = "97d17ed96200cbf906e0c2f33ab950cb795b9a5db6e233b70649e2bdf0f012716c6cfa48893890b11a588172e67005f4e1cb076ee9f43552ec2752bfa2938490"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nchairx-doc"

RDEPENDS:${PN} += ""

inherit rpm
