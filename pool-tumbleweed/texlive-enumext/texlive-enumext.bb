SUMMARY = "Enumerate exercise sheets"
DESCRIPTION = "This package provides enumerated list environments compatible \
with tagging PDF for creating 'simple exercise sheets' along \
with 'multiple choice questions', storing the 'answers' to \
these in memory using the multicol package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn77364"

RPM_NAME = "texlive-enumext-2026.226.2.1svn77364-61.4.noarch.rpm"
RPM_HASH = "c81be31634f625ce17d6b9d97ce1f5234551b0f8be4a455ba02c831e22aa7b83c2ae32fe90df2ebd16867c17939619cb643a0a45662ea5786ed40f33ce5c7060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enumext.sty \
texlive-enumext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multicol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
