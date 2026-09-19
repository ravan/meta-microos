SUMMARY = "Provides an At-Begin-Page hook"
DESCRIPTION = "Using the \\AtBeginPage hook, you can add material in the \
background of a page. \\PageLayout can be used to give page \
makeup commands to be executed on every page (e.g., depending \
on the page style)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn17062"

RPM_NAME = "texlive-bophook-2026.226.0.0.02svn17062-59.2.noarch.rpm"
RPM_HASH = "9bfcb4bbea7300892415ccab45097531a597f7c1534c160c9b56aaf2049d33bc211bbc33734f99e3708174937c60d47d729ffe61f0b6f5910155f7d005fd33c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bophook.sty \
texlive-bophook"

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
