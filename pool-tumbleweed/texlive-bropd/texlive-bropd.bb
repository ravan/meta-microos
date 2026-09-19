SUMMARY = "Simplified brackets and differentials in LaTeX"
DESCRIPTION = "The package simplifies the process of writing differential \
operators and brackets in LaTeX. The commands facilitate the \
easy manipulation of equations involving brackets and allow \
partial differentials to be expressed in an alternate form."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn35383"

RPM_NAME = "texlive-bropd-2026.226.1.2svn35383-59.2.noarch.rpm"
RPM_HASH = "a3d2cb8ddf462b30f6f514a95abe7a3451d9fc7624355929e66da2501216a5c81ed3080d04b03338bd0a2eac83a0d9e5cd31b0cb683e9b93a56d8bdb49f50c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bropd.sty \
texlive-bropd"

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
