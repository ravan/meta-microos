SUMMARY = "Extend 'improperly closed environment' messages"
DESCRIPTION = "When an environment is left open, LaTeX gives an error at the \
end of the document. However it only informs about the first of \
them, while the rest are shown with meaningless errors: (\\end \
occurred inside a group at level N) This package replaces these \
errors with more useful messages which show which environments \
(in reverse order) were not closed. There are no user macros: \
just use the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn78101"

RPM_NAME = "texlive-checkend-2026.226.1.0svn78101-60.2.noarch.rpm"
RPM_HASH = "c48b6e36bdfc338b44e51520c7f8e24b138df3d1295def74630d14341082f9216f0f5769b30c8757fdede343c6512c3e24991010c9ac1902835dcd15e42b477f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-checkend.sty \
texlive-checkend"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
