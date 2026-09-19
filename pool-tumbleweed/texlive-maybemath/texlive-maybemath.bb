SUMMARY = "Make math bold or italic according to context"
DESCRIPTION = "The \\maybebm and \\maybeit macros can be used in maths \
expressions to make the arguments typeset as bold or italic \
respectively if the surrounding context is appropriate. They \
are useful for writing user macros for use in general contexts. \
\\maybebm is especially appropriate when section titles contain \
math expressions, since the title will appear bold but the \
header and table of contents usually replicate the title in \
normal width. It uses the bm package to make things bold \
\\maybeit performs a similar role to \\mathrm{} but the maths \
expression will be italicised if the surrounding text is. \
\\maybeitsubscript is provided to shift subscripts to the left \
if the expression is italicised."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-maybemath-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "c6707060140d2f8b94b40cd5461ed98726f265d7fa44a9104448dcc4434a7b0e633b3a6a6a4982aafdfbfef0f194f4cf9f7a7742464f7e766a22faa20bbb9697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maybemath.sty \
texlive-maybemath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
