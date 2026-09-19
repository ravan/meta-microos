SUMMARY = "A package for compositional delimiter sizing"
DESCRIPTION = "Correctly sizing delimiters is very difficult, particularly in \
well-architected documents: a correctly engineered mathematical \
document will include macros for all operations, and these \
macros necessarily will include delimiters (such as \
parentheses). However, the correct size for the delimiter \
cannot be chosen ahead of time, because it will depend on the \
arguments; two options are available: Provide optional \
arguments to each notation macro for choosing delimiter sizes. \
This is nearly intractable to do in practice. Ignore delimiter \
sizes. With jmsdelim we offer an alternative: the correct \
delimiter sizes can be set at the leaf nodes of a mathematical \
expression, and magically bubble upward through the delimiters."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn62630"

RPM_NAME = "texlive-jmsdelim-2026.226.0.0.2.0svn62630-63.2.noarch.rpm"
RPM_HASH = "3ee6f5f790800edb88d80368bcea6975209e3501b644baa9fe92f349a0bbda588207b587f6869ffc26c2fcfac0fe793fee876538045456e55ac3fca2b126b1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-jmsdelim.sty \
texlive-jmsdelim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-ifluatex.sty \
tex-l3keys2e.sty \
tex-scalerel.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
