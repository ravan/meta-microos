SUMMARY = "Severed fonts for texlive-fontawesome"
DESCRIPTION = "The  separated fonts package for texlive-fontawesome"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.6.3.2svn48145"

RPM_NAME = "texlive-fontawesome-fonts-2026.226.4.6.3.2svn48145-60.2.noarch.rpm"
RPM_HASH = "f8714edfa3237fe38f98ffe8b342aedb60e2fe0f01284e7de030b47607d4b8c1ee7df31672813b95f3536e87f0d72568e18344ff44feb554840c02a9e65582bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-fontawesome-fonts \
font-fontawesome \
texlive-fontawesome-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
