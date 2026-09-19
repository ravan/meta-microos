SUMMARY = "Severed fonts for texlive-aramaic-serto"
DESCRIPTION = "The  separated fonts package for texlive-aramaic-serto"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.2svn74548"

RPM_NAME = "texlive-aramaic-serto-fonts-2026.226.1.3.2svn74548-61.2.noarch.rpm"
RPM_HASH = "f75605073a9bb810b92d3f33961b93e31fdda164b7781dd1fc5cca38096061ad4b4920902822077bfa53653debd979fd16c139e173e561f175215b41a3f8e832"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-assy \
font-assyrb10 \
font-serto10 \
font-sertob10 \
texlive-aramaic-serto-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
