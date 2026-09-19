SUMMARY = "Documentation for texlive-cahierprof"
DESCRIPTION = "This package includes the documentation for texlive-cahierprof"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn76102"

RPM_NAME = "texlive-cahierprof-doc-2026.226.1.3svn76102-59.2.noarch.rpm"
RPM_HASH = "488269464e3bae466482ac324a3c75014e2bb3908b15781a0b1c1b765a7946b6e97cf4a171b439d90c6baeb1fb2598c0d2e519b50099c986875026a9d87929cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cahierprof-doc-fr \
texlive-cahierprof-doc"

RDEPENDS:${PN} += ""

inherit rpm
