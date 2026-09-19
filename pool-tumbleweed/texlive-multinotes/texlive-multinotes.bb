SUMMARY = "Typesetting multilingual lecture notes and exercise sheets"
DESCRIPTION = "This package provides tools for typesetting multilingual \
lecture notes, exercise sheets, and general-purpose documents. \
Each language is specified via its corresponding babel \
identifier and is associated with a declaration, macro, and \
environment used to delimit content written in that language. \
Arbitrary combinations of languages can be loaded in a single \
document to support both monolingual and multilingual output. \
The package also defines macros and environments for \
typesetting lecture notes and exercise sheets, including \
configurable inclusion of elements such as proofs, solutions, \
and sketchboxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn75610"

RPM_NAME = "texlive-multinotes-2026.226.1.1svn75610-61.2.noarch.rpm"
RPM_HASH = "a6dfe05467d71801a2abe76fbc2a155f89c8a36bc6512c2c511b61a6d01dd6023c5ecf1126bed16aaec3d0046f9bb3619bf39ed7968373f8bbab4cbef6a8bb45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multinotes.sty \
texlive-multinotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-caption.sty \
tex-comment.sty \
tex-etoolbox.sty \
tex-float.sty \
tex-graphicx.sty \
tex-paracol.sty \
tex-setspace.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titling.sty \
tex-translations.sty \
tex-trimspaces.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
