SUMMARY = "A LaTeX class for SSHRC Insight Grant proposals"
DESCRIPTION = "The sshrc-insight LaTeX class facilitates the preparation of \
funding proposals for the Insight Grants program of Canada's \
Social Sciences and Humanities Research Council (SSHRC). It has \
the following key features: Formats the proposal according to \
the SSHRC's specifications. Allows parts of the proposal to be \
compiled into separate PDFs to attach to the appropriate places \
in the online application form. Alternatively, allows the \
proposal to be compiled into a single PDF in order to \
facilitate the writing and pre-submission reviewing process. \
Ensures that citation numbering remains consistent regardless \
whether the proposal is compiled as separate PDFs or a single \
PDF. Provides character counts for long-answer form fields. \
Supports preparation of proposals in either English or French. \
Compatible with pdfLaTeX, XeLaTeX, and LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.2025.0.0svn76065"

RPM_NAME = "texlive-sshrc-insight-2026.226.2025.0.0svn76065-64.2.noarch.rpm"
RPM_HASH = "157dcf5091065f2a6cd4cf1c72b8e8a5df960398014cf91c9069d7ffedf30c095ed4fa2107ceb755e69206d59c8c729636f119f1d0211ab173217609ff60f8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sshrc-insight-2024-10-12.cls \
tex-sshrc-insight.cls \
texlive-sshrc-insight"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-biblatex-readbbl.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-nopageno.sty \
tex-subfiles.sty \
tex-tokcycle.sty \
tex-translations.sty \
tex-ulem.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
