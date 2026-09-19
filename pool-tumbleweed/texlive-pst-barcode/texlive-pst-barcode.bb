SUMMARY = "Print barcodes using PostScript"
DESCRIPTION = "The pst-barcode package allows printing of barcodes, in a huge \
variety of formats, including quick-response (qr) codes (see \
documentation for details). As a PSTricks package, the package \
requires pstricks. The package uses PostScript for calculating \
the bars. For PDF output use a multi-pass mechanism such as \
pst-pdf."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn77682"

RPM_NAME = "texlive-pst-barcode-2026.226.0.0.20svn77682-59.2.noarch.rpm"
RPM_HASH = "9320cb19800b478d1f94433c1ba03dda5db71f563e170edeac83270d53dbc73a7e01e2fddddcb3a1e3d415687e41aca0f1573c3f0c9583fd53200e3285887ddc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-barcode.sty \
tex-pst-barcode.tex \
texlive-pst-barcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
