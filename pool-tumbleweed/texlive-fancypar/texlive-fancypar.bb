SUMMARY = "Decoration of individual paragraphs"
DESCRIPTION = "Decorates individual paragraphs of a document, offering five \
pre-defined styles. The command offers an optional 'key-value' \
argument with the user may define parameters of the selected \
style. Predefined styles offer a spiral-notebook, a zebra-like, \
a dashed, a marked design, and an underlined style. Users may \
also define their own styles. Decorated paragraphs may not \
include displayed mathematics."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-fancypar-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "4161211b2ca12c8eef16a2d1c8a1cfaf819c31e0fdf6903b6f79c5967c7763955913ddc4b9d36de8a0492822c40948e0a2af48575944202c56db704be4debf32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancypar.sty \
texlive-fancypar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
