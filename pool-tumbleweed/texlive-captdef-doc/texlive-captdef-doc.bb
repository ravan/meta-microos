SUMMARY = "Documentation for texlive-captdef"
DESCRIPTION = "This package includes the documentation for texlive-captdef"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-captdef-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "a909ea141b407f05f2932c9557eb9755b1dc5fbd7b5f0707803277ad8a49e0ef5f28b30d2dcf2d8ac15db110a75b6d0119cc71f1012078fbfba15f0dcd9822c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-captdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
