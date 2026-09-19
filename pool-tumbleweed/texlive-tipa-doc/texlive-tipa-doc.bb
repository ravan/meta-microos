SUMMARY = "Documentation for texlive-tipa"
DESCRIPTION = "This package includes the documentation for texlive-tipa"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-tipa-doc-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "78d28677a0f27e25e1782efa56622f1d28c960156dbdd2fd4d6d0c677bbe7925e0dad10a1de42f454f48152b213b8474ad0724c9d7734d73210580a4f3f4b243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tipa-doc-en \
texlive-tipa-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
