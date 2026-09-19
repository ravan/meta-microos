SUMMARY = "Bibliographic references as footnotes"
DESCRIPTION = "The package makes bibliographic references appear as footnotes. \
It defines a command \\footcite which is similar to the LaTeX \
\\cite command but the references cited in this way appear at \
the bottom of the pages. This 'foot bibliography' does not \
conflict with the standard one and both may exist \
simultaneously in a document. The command \\cite may still be \
used to produce the standard bibliography. The foot \
bibliography uses its own style and bibliographic database \
which may be specified independently of the standard one. Any \
standard bibliography style may be used."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.7svn17115"

RPM_NAME = "texlive-footbib-2026.226.2.0.7svn17115-60.2.noarch.rpm"
RPM_HASH = "4af1cfb99ede1e7ab73465938034330b3be2cf3fa3a7041edabaa5eb93f3c54863da6b1c3f3cb02f9bd4907f4164a7bc3950f58c693184f339b14ec7035832b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footbib.sty \
texlive-footbib"

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
