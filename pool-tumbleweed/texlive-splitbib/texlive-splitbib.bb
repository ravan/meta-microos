SUMMARY = "Split and reorder your bibliography"
DESCRIPTION = "This package enables you to split a bibliography into several \
categories and subcategories. It does not depend on BibTeX: any \
bibliography may be split and reordered."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.17svn77682"

RPM_NAME = "texlive-splitbib-2026.226.1.17svn77682-64.2.noarch.rpm"
RPM_HASH = "62f233743eb34db74758aa2db7cdf7e56ae812731aa7490c91b77b424eb903ad646e3698f9b7f9871cef4c4ed1b1f4ac84f35dac4c1da22d7a2772268e87f2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-splitbib.sty \
texlive-splitbib"

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
