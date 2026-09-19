SUMMARY = "Lists using a single active character"
DESCRIPTION = "This package allows you to create lists of numbered items (as \
in Wittgenstein's 'Tractatus') with a single active character \
as the only command. A variety of parameters are available to \
configure the appearance of the list; lists may be nested \
(effectively to unlimited depth)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-easylist-2026.226.1.3svn77682-61.4.noarch.rpm"
RPM_HASH = "17743fb6155ff4aa54a7a1462d1dbddfff7e6c418a9a01d7d24ec08aed85dd07eb08f82a5afccbfe83f0ceb5d3edc33bf46825a83be1354a31d68ab83d481634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-easylist.sty \
texlive-easylist"

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
