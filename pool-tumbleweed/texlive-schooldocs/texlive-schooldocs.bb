SUMMARY = "Various layout styles for school documents"
DESCRIPTION = "The aim of this package is to offer diverse layout styles for \
school-related documents. It serves well in creating exercise \
sheets, exams, course materials. The package sets the page \
geometry (dimensions of text and margins) and the title \
formatting. Various styles are available defining settings for \
headers, footers or alternative title formatting, providing \
many customizable features."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn73466"

RPM_NAME = "texlive-schooldocs-2026.226.1.6svn73466-60.2.noarch.rpm"
RPM_HASH = "62abf76269cce155e3c8207afd4571c37b446bc6d220331a255c7d4eca1eedf47ee475973f49f87a209aa39a2258632fed1e194f58729323193bc1700c7bb624"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-schooldocs.sty \
texlive-schooldocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-totpages.sty \
tex-translations.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
