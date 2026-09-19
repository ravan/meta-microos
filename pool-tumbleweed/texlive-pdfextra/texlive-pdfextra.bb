SUMMARY = "Extra PDF features for (Op)TeX"
DESCRIPTION = "This package provides extra PDF features for OpTeX (or in \
limited form for plain LuaTeX and LuaLaTeX). As a minimalistic \
format, OpTeX does not support 'advanced' features of the PDF \
file format in its base. This third party package aims to \
provide them. Summary of supported features: insertion of \
multimedia (audio, video, 3D), hyperlinks and other actions, \
triggering events, transitions, attachments."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn65184"

RPM_NAME = "texlive-pdfextra-2026.226.0.0.3svn65184-58.2.noarch.rpm"
RPM_HASH = "b6fb0d6b0094488c1ea1191893d750973ebe5e76729e039a5f654c143abe203a7b18d6d8601c2b557c64a301de42140d84efca0d131c7837f8096b00219e68cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfextra.sty \
tex-pdfextra.tex \
texlive-pdfextra"

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
