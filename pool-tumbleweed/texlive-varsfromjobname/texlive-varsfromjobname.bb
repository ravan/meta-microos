SUMMARY = "Extract variables from the name of the LaTeX file"
DESCRIPTION = "The package allows the user to extract information from the job \
name, provided that the name has been structured appropriately: \
the package expects the file name to consist of a set of words \
separated by hyphens."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-varsfromjobname-2026.226.1.1svn76924-60.2.noarch.rpm"
RPM_HASH = "d67a0789b0204b4810183be17ca9b41d17cc2dd49959cf2118815e6419013878adcdd2bf29ef642a40b8bb6d6556eef89087ef8fd00e33e9ed5985a5909c2ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-varsfromjobname.sty \
texlive-varsfromjobname"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
