SUMMARY = "Fill vertical space with solid rules or dotted lines"
DESCRIPTION = "A LaTeX package for filling vertical space with something \
rather than nothing. Currently supported somethings are solid \
rules and dotted lines, with or without numbers. The package \
uses a mixture of plain-ish macros, LaTeX2e and expl3 methods, \
but a key-value approach to configuration should make the \
document-level interface relatively sane, even if nothing else \
is."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn76924"

RPM_NAME = "texlive-fillwith-2026.226.0.0.3svn76924-59.2.noarch.rpm"
RPM_HASH = "bffdd2397a86d0a34f57e37c631f4d43c1d105e542a7aedad8c725fd6ce7d554b8da326eaf1a37ddb960b1da1cedc40c7501052824db956920ebd8d9c00bb11b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fillwith.sty \
texlive-fillwith"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-svn-prov.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
