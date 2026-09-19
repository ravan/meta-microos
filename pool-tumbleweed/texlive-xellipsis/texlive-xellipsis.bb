SUMMARY = "Extremely configurable ellipses with formats for various style manuals"
DESCRIPTION = "The xellipsis package provides a system for configuring \
(almomst) every possible aspect of ellipses, including \
preceding and proceeding characters; the character itself; \
distances before and after each of these; and number of \
characters. It comes with both a compatibility option for \
standard LaTeX \\ldots as well as preset package options for the \
Chicago Manual of Style (Turabian); the Bluebook; and MLA \
guidelines."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn47546"

RPM_NAME = "texlive-xellipsis-2026.226.2.0svn47546-59.4.noarch.rpm"
RPM_HASH = "d15e39b75d4739fae4d17ac67a22dcf70e70ff4264de011d30685bdc6e4499c3e7570c13badbebef79ea4d3f1793b300f47045ed9f9212dddab3ed946fd9ec55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xellipsis.sty \
texlive-xellipsis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
