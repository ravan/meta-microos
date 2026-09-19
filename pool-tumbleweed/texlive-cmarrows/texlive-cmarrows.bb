SUMMARY = "MetaPost arrows and braces in the Computer Modern style"
DESCRIPTION = "This MetaPost package contains macros to draw arrows and braces \
in the Computer Modern style."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn24378"

RPM_NAME = "texlive-cmarrows-2026.226.0.0.9svn24378-60.2.noarch.rpm"
RPM_HASH = "3f03c1d7b44eba7d20c32db1dcae0cc77219b08203632932e1b20b2f7050f16f0b2a1e13ebb956ded53a99f20e9432b2d4834b56da8863bdf3c87208cf6d86db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmarrows"

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
