SUMMARY = "Support for psfrag within pdfLaTeX"
DESCRIPTION = "The package works in the same sort of way as pst-pdf, but it \
also processes the PostScript graphics with psfrag to add \
labels within the graphic, before conversion. Thus the bundle \
replaces two steps of an ordinary workflow. (Naturally, the \
package requires that \\write 18 is enabled.) Pstool ensures \
that each version of each graphic is compiled once only (the \
graphic is (re-)compiled only if it has changed since the \
previous compilation of the document). This drastically speeds \
up the running of the package in the typical case (though the \
first run of any document is inevitably just as slow as with \
any similar package)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5esvn46393"

RPM_NAME = "texlive-pstool-2026.226.1.5esvn46393-60.4.noarch.rpm"
RPM_HASH = "a9c2f0041738f5336de1c54e3cf43d4af11cba9351aa89fbe2191fc9a8c5adc8fbb46a528cab3a3cac725b5b2764cce56d3684fca58b681db3b66f1e67962e12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstool.sty \
texlive-pstool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-preview.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
