SUMMARY = "Documentation for texlive-isonums"
DESCRIPTION = "This package includes the documentation for texlive-isonums"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn17362"

RPM_NAME = "texlive-isonums-doc-2026.226.1.0svn17362-63.2.noarch.rpm"
RPM_HASH = "4818a227f0e51ee49500c51230ea350b2a75da5a8c5bb5dab97a3298c36830cc7fcc2089b06703f485fcf1f47ac4f39799d302266bfd5ae7a4623fbe4b578759"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-isonums-doc"

RDEPENDS:${PN} += ""

inherit rpm
