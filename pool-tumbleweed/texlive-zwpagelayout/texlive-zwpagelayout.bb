SUMMARY = "Page layout and crop-marks"
DESCRIPTION = "This package was developed as a typographers' toolbox offering \
important basic features for everyday work. It allows setting \
the paper size and the page layout; it can print crop marks; \
and it can reflect pages both horizontally and vertically. The \
package facilities work with TeX (output via dvips or \
(x)dvipdfm(x)), and with pdfTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4esvn63074"

RPM_NAME = "texlive-zwpagelayout-2026.226.1.4esvn63074-59.4.noarch.rpm"
RPM_HASH = "2a1c7ee9febdc85f780bd80193134ca64f05642f6c98913b2b42f872ef202d8fb802af4276d374c5260a8eccf06b3ac92231ca9b587d4e28d3d6fbe6af757187"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zwpagelayout.sty \
texlive-zwpagelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-kvoptions.sty \
tex-luatex85.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
