SUMMARY = "Severed fonts for texlive-tabvar"
DESCRIPTION = "The  separated fonts package for texlive-tabvar"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.8svn63921"

RPM_NAME = "texlive-tabvar-fonts-2026.227.1.8svn63921-62.2.noarch.rpm"
RPM_HASH = "5a7096eb7dabcd6dad519bd31c3c475cfc25fb62c1e1d83e0d3f2c71d215a4cdba6f5ce2da84be110c8d1e2e6926135a8b7993a4430f2e933f39c01c9e7171f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font-tabvar \
texlive-tabvar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
