SUMMARY = "Severed fonts for texlive-wasy-type1"
DESCRIPTION = "The  separated fonts package for texlive-wasy-type1"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.001.002svn53534"

RPM_NAME = "texlive-wasy-type1-fonts-2026.226.001.002svn53534-60.2.noarch.rpm"
RPM_HASH = "36ffe30987be3c7bfd53f8a50f60a850e7b53d9f193b8aa6f1fb3836725d98fd17022d52a13048864483f494735fadc3014fecea948c42dae9cca9beba98bef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-wasy \
font-wasysl10 \
texlive-wasy-type1-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
