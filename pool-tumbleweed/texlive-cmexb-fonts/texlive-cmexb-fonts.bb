SUMMARY = "Severed fonts for texlive-cmexb"
DESCRIPTION = "The  separated fonts package for texlive-cmexb"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-cmexb-fonts-2026.226.svn54074-60.2.noarch.rpm"
RPM_HASH = "ba0a55d0775a6d9e190cd40a064675cc8246ee67a33e18f48018ba9f282a8066dd34298480bdb99297c2b0cda95df087f9486c7bf4730cc8049818bbf2dcb593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-computermodern \
texlive-cmexb-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
