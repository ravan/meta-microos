SUMMARY = "Alter the position of affiliations in amsart"
DESCRIPTION = "The package is to be used with the amsart documentclass. It \
lets you move the authors' affiliations either just below the \
authors' names on the front page or as footnotes on the first \
page. The email addresses are always listed as a footnote on \
the front page."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-amsaddr-2026.226.1.3svn77682-61.2.noarch.rpm"
RPM_HASH = "6804a34294610f292ebc4189ee87ed9140fc74ba17051962840b7f96a1782963aa1ac36098baaf7bda825f461824c23cdca339a5e37e6cde497ffb45d452bc63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsaddr.sty \
texlive-amsaddr"

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
