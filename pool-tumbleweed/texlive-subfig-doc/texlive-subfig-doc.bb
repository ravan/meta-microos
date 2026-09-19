SUMMARY = "Documentation for texlive-subfig"
DESCRIPTION = "This package includes the documentation for texlive-subfig"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-subfig-doc-2026.226.1.3svn77682-64.2.noarch.rpm"
RPM_HASH = "3857fd0d26d61e2c3752c8ff27bae02a2a2a07b0f8cb5252fd011173f0591d4459da02ac17ae1c0ec51f37c44c6ff7024cc779f360576d08db736977d2a0ef16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
