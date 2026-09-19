SUMMARY = "Severed fonts for texlive-lineara"
DESCRIPTION = "The  separated fonts package for texlive-lineara"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn63169"

RPM_NAME = "texlive-lineara-fonts-2026.226.svn63169-61.2.noarch.rpm"
RPM_HASH = "58dace5f322b7d574df113df208b02b61a54ae0d2f126425b446e9222e87c8d1512404c4550bd3b5255728e62495fb827a884c9ce347019edf89f176159be987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-lineara \
font-linearacmplxsigns \
texlive-lineara-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
