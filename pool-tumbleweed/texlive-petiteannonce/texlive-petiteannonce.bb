SUMMARY = "A class for small advertisements"
DESCRIPTION = "The class enables you to create the sort of adverts that you \
pin on a noticeboard, with tear-off strips at the bottom where \
you can place contact details."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0001svn25915"

RPM_NAME = "texlive-petiteannonce-2026.226.1.0001svn25915-58.2.noarch.rpm"
RPM_HASH = "dc074a454b66a34ef4e13aeb642c29ec47dfb1d2fea3d77da5f63072b4235b394826b24e5541415a2809af33eabd4ee4b086814801004e18cd3d4f3979309afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-petiteannonce.cls \
texlive-petiteannonce"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
