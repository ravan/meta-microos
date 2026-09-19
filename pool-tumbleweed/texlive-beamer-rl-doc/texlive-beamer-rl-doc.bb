SUMMARY = "Documentation for texlive-beamer-rl"
DESCRIPTION = "This package includes the documentation for texlive-beamer-rl"
LICENSE = "LPPL-1.0"

PV = "2026.226.2svn76587"

RPM_NAME = "texlive-beamer-rl-doc-2026.226.2svn76587-61.2.noarch.rpm"
RPM_HASH = "77dafbbf4b2ad264749122b1b1d0d4063cd811151119ca0dadcb8b71e2cf5c594a6a22ed7eeca6488cd814ea93f54c9ccc3184f7d02cb97109a14f99fb40f2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamer-rl-doc-ar;en \
texlive-beamer-rl-doc"

RDEPENDS:${PN} += ""

inherit rpm
