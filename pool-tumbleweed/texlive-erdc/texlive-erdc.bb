SUMMARY = "Style for Reports by US Army Corps of Engineers"
DESCRIPTION = "A class for typesetting Technical Information Reports of the \
Engineer Research and Development Center, US Army Corps of \
Engineers. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-erdc-2026.226.1.1svn15878-61.4.noarch.rpm"
RPM_HASH = "6cf786fae3d1003e8c8f4d459c8a37b8dfb5bcc536e529156f3ce34b5d9fecca7484c03a2b4a9755e776710f9c0faef781360ca7e4fd07da0f87a974155a9f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-erdc.cls \
texlive-erdc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-caption.sty \
tex-color.sty \
tex-courier.sty \
tex-dcolumn.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-natbib.sty \
tex-ragged2e.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
