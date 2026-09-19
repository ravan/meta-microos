SUMMARY = "Extended conditional commands"
DESCRIPTION = "This package extends the ifthen package by implementing new \
commands to go within the first argument of \\ifthenelse: to \
test whether a string is void or not, if a command is defined \
or equivalent to another. The package also enables use of \
complex expressions as introduced by the package calc, together \
with the ability of defining new commands to handle complex \
tests."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn77682"

RPM_NAME = "texlive-xifthen-2026.226.1.4.0svn77682-59.4.noarch.rpm"
RPM_HASH = "a683546f6fe4d0fc6c1f29e7f3fbfde124423c42391bcbd6110a15375cda1b8bd53afa70b9c644997fc548d25e8f82f9f4d02af05219ebd39b1fff2db72a404d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xifthen.sty \
texlive-xifthen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifmtarg.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
