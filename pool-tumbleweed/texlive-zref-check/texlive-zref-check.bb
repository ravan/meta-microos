SUMMARY = "Flexible cross-references with contextual checks based on zref"
DESCRIPTION = "This package provides an user interface for making LaTeX \
cross-references flexibly, while allowing to have them checked \
for consistency with the document structure as typeset. \
Statements such as 'above', 'on the next page', 'previously', \
'as will be discussed', 'on the previous chapter' and so on can \
be given to \\zcheck in free-form, and a set of 'checks' can be \
specified to be run against a given 'label', which will result \
in a warning at compilation time if any of these checks fail. \
\\zctarget and the zcregion environment are also defined as a \
means to easily set label targets to arbitrary places in the \
text which can be referred to by \\zcheck."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.7svn78101"

RPM_NAME = "texlive-zref-check-2026.226.0.0.3.7svn78101-59.4.noarch.rpm"
RPM_HASH = "213db44dd35d7028d4a9a6dbbd2972447495250271c5a72357f19b84bccaeab3b251a36239b04fb0dc44d1af8fba3396204f6163f46d8c12939379279b18717d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zref-check.sty \
texlive-zref-check"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifdraft.sty \
tex-zref-abspage.sty \
tex-zref-hyperref.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
