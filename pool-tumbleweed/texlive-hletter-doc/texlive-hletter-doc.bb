SUMMARY = "Documentation for texlive-hletter"
DESCRIPTION = "This package includes the documentation for texlive-hletter"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.2svn30002"

RPM_NAME = "texlive-hletter-doc-2026.226.4.2svn30002-60.4.noarch.rpm"
RPM_HASH = "c3530ba92a415f4d729bc17e4a3b4f1df326b043c0f83cac151eb70dd8ed840126b69c41d5a46e1d71effa103eef8a74cec3c7b5334b73fd6f21532d26f69eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
