SUMMARY = "Permit footnotes in tables"
DESCRIPTION = "The package provides the command \\tablefootnote to be used in a \
table or sidewaystable environment, where \\footnote will not \
work (and when using \\footnotemark and \\footnotetext, and \
adjusting the counter as necessary, is too much work)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-tablefootnote-2026.226.1.1csvn77682-64.2.noarch.rpm"
RPM_HASH = "5e29ca366ff4afcdffe819b9dfa4170ad3441e3859a77d2f0fb25099acd3b624bc9199a8f9e49cb526727affccf2e1b93348e2a5e88e63b905d151f59ed67cfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tablefootnote.sty \
texlive-tablefootnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-letltxmacro.sty \
tex-ltxcmds.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
