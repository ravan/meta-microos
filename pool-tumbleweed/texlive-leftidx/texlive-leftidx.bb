SUMMARY = "Left and right subscripts and superscripts in math mode"
DESCRIPTION = "Left and right subscripts and superscripts are automatically \
raised for better fitting to the symbol they belong to."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-leftidx-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "184c668b3897e37ddedf9539d9156356fbef546ae6f4ea52cb88c33b5118c9bab12dc5f41477c91d1417f066be2467f81c4ea01be86e3de8fed5a1ee81440da4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-leftidx.sty \
texlive-leftidx"

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
