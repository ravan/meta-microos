SUMMARY = "Collect LaTeX package information in a regular way"
DESCRIPTION = "This package is aimed at package writers and offers a way to \
collect/document LaTeX package information (name, version, \
description, etc.) in a systematic way."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn77338"

RPM_NAME = "texlive-pkginfograb-2026.226.1.2asvn77338-58.2.noarch.rpm"
RPM_HASH = "4fcee5312a4b2c0d6b3d7447cdfdb6fefbf0b47225a0fdb956209f5a8da692eb9c27cb0e594a977469ee258a5fea70546255d6f9f71fe93954a7ec3a925bf38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pkginfograb.sty \
texlive-pkginfograb"

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
