SUMMARY = "A BibLaTeX implementation of the AIP and APS bibliography style"
DESCRIPTION = "The package provides an implementation of the bibliography \
styles of both the AIP and the APS for BibLaTeX. This \
implementation follows standard BibLaTeX conventions, and can \
be used simply by loading BibLaTeX with the appropriate option: \
\\usepackage[style=phys]{biblatex} A demonstration database is \
provided to show how to format input for the style. Style \
options are provided to cover the minor formatting variations \
between the AIP and APS bibliography styles."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1esvn74898"

RPM_NAME = "texlive-biblatex-phys-2026.226.1.1esvn74898-61.2.noarch.rpm"
RPM_HASH = "96069fac78a1f20b8fb54283ca165942c845730cdda7841ec3cd7ca1d4da0bd42c8a46d016d347c62eabd9a9faac818a66030ceb208c74666bf2ad3b135c47ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phys.bbx \
tex-phys.cbx \
texlive-biblatex-phys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
