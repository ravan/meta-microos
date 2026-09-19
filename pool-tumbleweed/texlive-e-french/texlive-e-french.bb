SUMMARY = "Comprehensive LaTeX support for French-language typesetting"
DESCRIPTION = "E-french is a distribution that keeps alive the work of Bernard \
Gaulle (now deceased), under a free licence. It replaces the \
old 'full' frenchpro (the 'professional' distribution) and the \
light-weight frenchle packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.6.11svn52027"

RPM_NAME = "texlive-e-french-2026.226.6.11svn52027-61.4.noarch.rpm"
RPM_HASH = "7e9a79f6ab2ba1318eb5ed89e6bec9d859497499549c82f4cf6d3ed9b1649d44ed7b57dd77fa85921846b7289082a80ecd9f07822b0e1756cf4763c517da30d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-efrench.sty \
tex-efrenchu.tex \
tex-epreuve.sty \
tex-fenglish.sty \
tex-frabbrev-u8.tex \
tex-frabbrev.tex \
tex-french-french-msg.tex \
tex-french-msg.tex \
tex-french.cfg \
tex-french.sty \
tex-frenchle.cfg \
tex-frenchle.sty \
tex-frenchpro.sty \
tex-frhyphex.tex \
tex-fxabbrev.tex \
tex-german-french-msg.tex \
tex-mlp-01.sty \
tex-mlp-33.sty \
tex-mlp-49.sty \
tex-mlp-49n.sty \
tex-mlp-opts.sty \
tex-mlp.sty \
tex-pmfrench.sty \
texlive-e-french"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-german.sty \
tex-latexsym.sty \
tex-msg.sty \
tex-ngerman.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
