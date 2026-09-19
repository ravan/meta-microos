SUMMARY = "Visual display of ConTeXt counters"
DESCRIPTION = "A typical document usually contains many counters: page \
numbers, section numbers, itemizations, enumerations, theorems, \
and so on. This module provides a visual display for such \
counters."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn47085"

RPM_NAME = "texlive-context-visualcounter-2026.226.svn47085-61.2.noarch.rpm"
RPM_HASH = "528ce7af13b1111d0b2c379f7d4de504360802499130be2e31575b0bf2b1932cbf3cb32824a519fc2c71f509fd595aa4e19c1931fb02eef2afc96205fbf610de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-visualcounter"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
