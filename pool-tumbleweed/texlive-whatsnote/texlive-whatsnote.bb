SUMMARY = "A LaTeX class for taking notes in science, engineering, etcetera"
DESCRIPTION = "This LaTeX class provides an elegant layout and powerful tools \
for taking notes in science, engineering, etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0bsvn76836"

RPM_NAME = "texlive-whatsnote-2026.226.5.0bsvn76836-60.2.noarch.rpm"
RPM_HASH = "52358c18e6b576c404af7371dfb57d18487f48cbd61264938516a97ae28a64dd7194302d12fc57d7d4e00e4076ed3522e864895ddd00ecff4278d47723302dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-litebook.sty \
tex-litesolution.sty \
tex-thmlist.sty \
tex-whats-cover-module.code.tex \
tex-whats-layout-module.code.tex \
tex-whats-theorem-module.code.tex \
tex-whats-typeset-module.code.tex \
tex-whatsnote.cls \
texlive-whatsnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-minimal.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
