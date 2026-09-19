SUMMARY = "A set of useful macro tools"
DESCRIPTION = "Included are: quire: making booklets, etc.; gloss: vertically \
align words in consecutive sentences; loop: a looping \
construct; dolines: 'meta'-macros to separate arguments by \
newlines; labels: address labels and bulk mail letters; \
styledef: selectively input part of a file; and border: borders \
around boxes."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-midnight-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "ce92a6e3038f860260b264a10e211d5072b71808218930bc6f460bcc9c70eb3c24ca791f3cca577aff4e4f8e1c3bcc92edf339d40beb42771aaac7296f055219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-border.tex \
tex-dolines.tex \
tex-gloss.tex \
tex-labels.tex \
tex-loop.tex \
tex-quire.tex \
tex-styledef.tex \
texlive-midnight"

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
