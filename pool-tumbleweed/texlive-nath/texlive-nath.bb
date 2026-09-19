SUMMARY = "Natural mathematics notation"
DESCRIPTION = "Nath is a LaTeX (both 2e and 2.09) style to separate \
presentation and content in mathematical typography. The style \
delivers a particular context-dependent presentation on the \
basis of a rather coarse context-independent notation. \
Highlighted features: depending on the context, the command \
\\frac produces either built-up or case or solidus fractions, \
with parentheses added whenever required for preservation of \
the mathematical meaning; delimiters adapt their size to the \
material enclosed, rendering \\left and \\right almost obsolete."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-nath-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "6ed37de29bd2acee287be30aa235401f1f302d8696489e35ba9168044819d5d23a167e7505e9deeb862e80525ac88df34d12559f8b3f121d60bb609199a4a210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nath.sty \
texlive-nath"

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
