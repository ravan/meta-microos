SUMMARY = "Framed minipages of a specified total width (text and frame combined)"
DESCRIPTION = "The package essentially just wraps a minipage within an \\fbox. \
However, while \
\\fbox{\\begin{minipage}{\\linewidth}...\\end{minipage}} juts out \
into the margin, \\begin{boxedminipage}...\\end{boxedminipage} \
does not. Instead, it subtracts the frame's dimensions from the \
specified dimensions of the minipage before typesetting the \
minipage. Note: The package was formerly known as \
boxedminipage2e and now replaces Mario Wolczko's earlier \
boxedminipage package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-boxedminipage-2026.226.1.1svn77682-59.2.noarch.rpm"
RPM_HASH = "64e76a288f189e66f7490101d90419e2fe66fba1f98c975a1bb3ca702996d7eb608fea836e85539689fcb3f1f65828f36aa23601b589c7cdacff0bd407437384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-boxedminipage.sty \
tex-boxedminipage2e.sty \
texlive-boxedminipage"

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
