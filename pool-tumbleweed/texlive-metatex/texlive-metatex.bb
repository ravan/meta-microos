SUMMARY = "Incorporate Metafont pictures in TeX source"
DESCRIPTION = "METATeX is a set of plain TeX and Metafont macros that you can \
use to define both the text and the figures in a single source \
file. Because METATeX sets up two way communication, from TeX \
to Metafont and back from Metafont to TeX, drawing dimensions \
can be controlled by TeX and labels can be located by Metafont. \
Only standard features of TeX and Metafont are used, but two \
runs of TeX and one of Metafont are needed."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-metatex-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "4d98c78ba7fe59065a2cb58978d934862913efefb1a414e504fcadb027635798b3a1d46047aa0a50a2b4d0ebd740fb8f1f46aba69db0dffefc20244817444f23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metatex.tex \
texlive-metatex"

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
