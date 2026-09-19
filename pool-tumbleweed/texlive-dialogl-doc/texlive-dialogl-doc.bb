SUMMARY = "Documentation for texlive-dialogl"
DESCRIPTION = "This package includes the documentation for texlive-dialogl"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28946"

RPM_NAME = "texlive-dialogl-doc-2026.226.svn28946-59.2.noarch.rpm"
RPM_HASH = "a177d12e176aec0fca558446bdbb671061b521cea6e13e26e5051ccc7b84e7f3848493e5d06dffdeb1922bdbfb8e343602209055bf9ab9f0760c8e3c71c5807c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dialogl-doc"

RDEPENDS:${PN} += ""

inherit rpm
