SUMMARY = "Print spectral sequence diagrams using PGF/TikZ"
DESCRIPTION = "The package is a specialized tool built on top of PGF/TikZ for \
drawing spectral sequences. It provides a powerful, concise \
syntax for specifying the data of a spectral sequence, and then \
allows the user to print various pages of spectral sequences, \
automatically choosing which subset of the classes, \
differentials, and structure lines to display on each page. It \
also handles most of the details of the layout. At the same \
time, it is extremely flexible. spectralsequences is closely \
integrated with TikZ to ensure that users can take advantage of \
as much as possible of its expressive power. It is possible to \
turn off most of the automated layout features and draw \
replacements using TikZ commands. The package also provides a \
carefully designed error reporting system intended to ensure \
that it is as clear as possible what is going wrong."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.3svn65667"

RPM_NAME = "texlive-spectralsequences-2026.226.1.3.3svn65667-64.2.noarch.rpm"
RPM_HASH = "72ec75464409b9ad9c3960ae062841240407b2b854ac7e5a387169aac02323b929703add116d77571d500bf4f841cd72edb0a91371ecb3a9ca853829020240bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spectralsequences.sty \
tex-sseqcheckdefinitions.code.tex \
tex-sseqdrawing.code.tex \
tex-sseqforeach.code.tex \
tex-sseqkeys.code.tex \
tex-sseqloadstore.code.tex \
tex-sseqmacromakers.code.tex \
tex-sseqmain.code.tex \
tex-sseqmessages.code.tex \
tex-sseqparsers.code.tex \
texlive-spectralsequences"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-pdfcomment.sty \
tex-tikz.sty \
tex-verbatim.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
