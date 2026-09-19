SUMMARY = "Typeset and index linguistic gloss abbreviations"
DESCRIPTION = "The package provides a set of macros for in-line linguistic \
examples (as opposed to interlinear glossing, set apart from \
the main text). It prevents hyphenated examples from breaking \
across lines and consistently formats phonemic examples, \
orthographic examples, and more."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0svn30788"

RPM_NAME = "texlive-textglos-2026.227.1.0svn30788-62.2.noarch.rpm"
RPM_HASH = "bbfcc3006c17b55ca8d4d342e730202224c5d2d478c5de611942fbb6b20eb4a4afd3bfb92e21e82904fdff529f2b847af04fed8fda9c98c45e509c1f142ecff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-textglos.sty \
texlive-textglos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
