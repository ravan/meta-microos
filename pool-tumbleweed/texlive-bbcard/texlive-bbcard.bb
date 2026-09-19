SUMMARY = "Bullshit bingo, calendar and baseball-score cards"
DESCRIPTION = "Three jiffy packages for creating cards of various sorts with \
MetaPost."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn19440"

RPM_NAME = "texlive-bbcard-2026.226.svn19440-60.2.noarch.rpm"
RPM_HASH = "c89959341fec9d3866e5dbdb94d6699acd189b13d6ff4e8b177d41c049e4865f9024e6be6aae104a011fe5b7f897389fa70840b18e266c88f345ada1f007b06f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbcard"

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
