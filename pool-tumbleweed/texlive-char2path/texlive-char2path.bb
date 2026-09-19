SUMMARY = "A LaTeX package that converts characters into TikZ paths"
DESCRIPTION = "This TikZ-based LaTeX package provides an easy way to convert \
characters to TikZ-paths representing these characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn76924"

RPM_NAME = "texlive-char2path-2026.226.1.0.0svn76924-60.2.noarch.rpm"
RPM_HASH = "d25f73a547f6db82ba46c19e7135cfbd1b9172b5d184a49bb6776269aa79d658b29671fa8ada6f7317433e3bbf8fae77bf2a67ad132cb9dd292edc7a74469b16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-char2path.sty \
tex-ctp-lmm-alpha-caps.data.tex \
tex-ctp-lmm-alpha-small.data.tex \
tex-ctp-lmm-arabic.data.tex \
tex-ctp-lmm-others.data.tex \
tex-ctp-lmr-alpha-caps.data.tex \
tex-ctp-lmr-alpha-small.data.tex \
tex-ctp-lmr-arabic.data.tex \
tex-ctp-lmr-others.data.tex \
tex-ctp-lms-alpha-caps.data.tex \
tex-ctp-lms-alpha-small.data.tex \
tex-ctp-lms-arabic.data.tex \
tex-ctp-lms-others.data.tex \
texlive-char2path"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
