SUMMARY = "LaTeX class for MLA papers"
DESCRIPTION = "In the United States, secondary and undergraduate students are \
generally expected to adhere to the format prescribed by the \
Modern Language Association (MLA) for typewritten essays, \
research papers and writings. This package provides a simple, \
straightforward LaTeX class for composing papers almost \
perfectly adherent to the MLA style guide."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn72271"

RPM_NAME = "texlive-mlacls-2026.226.1.1svn72271-61.2.noarch.rpm"
RPM_HASH = "27421e2f8736995ea30f840564962e00da1b4f61aa2ab77efe2f34b7c0d16bf252846824c3619dd93616d77fafcb676d6fbbb38363ce5019605b9052370a739c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mla.cls \
texlive-mlacls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-enotez.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fullpage.sty \
tex-graphicx.sty \
tex-hanging.sty \
tex-hyperref.sty \
tex-microtype.sty \
tex-newtxtext.sty \
tex-ragged2e.sty \
tex-titlesec.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
