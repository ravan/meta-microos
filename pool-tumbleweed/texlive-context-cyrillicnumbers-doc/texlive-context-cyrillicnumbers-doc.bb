SUMMARY = "Documentation for texlive-context-cyrillicnumbers"
DESCRIPTION = "This package includes the documentation for texlive-context-cyrillicnumbers"
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn47085"

RPM_NAME = "texlive-context-cyrillicnumbers-doc-2026.226.svn47085-61.2.noarch.rpm"
RPM_HASH = "98bc758c0b2645ad4108b04c5f2fbb5f4c731dcdd378e00c9520555299f290dad3265ac005595adc9b38ad0215164fbe849e89fe28d140dc1ad00f82c5958291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-cyrillicnumbers-doc"

RDEPENDS:${PN} += ""

inherit rpm
