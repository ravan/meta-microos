SUMMARY = "Underscored LaTeX hyperlinks"
DESCRIPTION = "This LaTeX package makes hyperlinks underscored, just like on \
the web. The package uses hyperref and ulem."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.2svn74512"

RPM_NAME = "texlive-href-ul-2026.226.0.0.5.2svn74512-60.4.noarch.rpm"
RPM_HASH = "5ffe04a7f94f8d4c7d28f39e40e3c312e79e56a05072eb72b835e3eab370d250c5e85cfd8ff64504fd203aff96371dd227107beafe35fcc28ae92b8c4680439a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-href-ul.sty \
texlive-href-ul"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-pgfopts.sty \
tex-ulem.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-hyperref \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-ulem"

inherit rpm
