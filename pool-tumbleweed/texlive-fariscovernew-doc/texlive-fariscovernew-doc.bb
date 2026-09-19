SUMMARY = "Documentation for texlive-fariscovernew"
DESCRIPTION = "This package includes the documentation for texlive-fariscovernew"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78033"

RPM_NAME = "texlive-fariscovernew-doc-2026.226.1.0svn78033-59.2.noarch.rpm"
RPM_HASH = "9e44b490bad1fa7e9a1d166c4c46251e636356ff3e46a75ab0b4aa518d05f87d69a664d473eda21a291bda3b0c4819fe833e273c8962c9af6ae4bccdd3c4ef06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fariscovernew-doc-ar \
texlive-fariscovernew-doc"

RDEPENDS:${PN} += ""

inherit rpm
