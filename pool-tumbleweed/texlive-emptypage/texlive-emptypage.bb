SUMMARY = "Make empty pages really empty"
DESCRIPTION = "This package prevents page numbers and headings from appearing \
on empty pages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn78101"

RPM_NAME = "texlive-emptypage-2026.226.1.2svn78101-61.4.noarch.rpm"
RPM_HASH = "0c9b244f9433da38d251432356fbc617e2fee4187819a9914bac2fb2d4c8bd4a1c707491939c08e31a9338edc926cd7737e1c495cbb30b2eb9fd1d4b6856ff4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-emptypage.sty \
texlive-emptypage"

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
