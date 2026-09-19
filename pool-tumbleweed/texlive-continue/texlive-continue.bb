SUMMARY = "Prints 'continuation' marks on pages of multipage documents"
DESCRIPTION = "This package provides for a variety of continuation indicators \
on pages when the text continues on the following page. The \
default is to only mark odd pages, but all pages can be marked \
and the marking can be stopped or started at any point."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-continue-2026.226.0.0.2svn77682-61.2.noarch.rpm"
RPM_HASH = "e52d0cefa4af5d4c8bca8630bfe53db8b50fcc4c1f822ba4b86181dc85bfffceb01b4f42294ef5aa39fc617cd75881956bafa09f77ed17f09e6d4bf926313add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-continue.sty \
texlive-continue"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-picture.sty \
tex-zref-abspage.sty \
tex-zref-lastpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
