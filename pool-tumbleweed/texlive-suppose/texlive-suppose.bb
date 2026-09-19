SUMMARY = "Abbreviate the word 'Suppose'"
DESCRIPTION = "This package provides commands for abbreviating the word \
'Suppose' in six fonts and with other variations. The author \
recommends only using these commands when the immediately \
succeeding strings are mathematical in nature. He does not \
recommend using them in formal work. The package requires \
amsmath, amsfonts, and graphicx."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn59281"

RPM_NAME = "texlive-suppose-2026.226.1.2.2svn59281-64.2.noarch.rpm"
RPM_HASH = "b04aa19399e58123ae902eef1b0d1499b25db9607afc786004c0d7f3d0e1302fe23cc0e4450640f50c98e1ab85899b07239bbf235eab192277c05512af7b5bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-suppose.sty \
texlive-suppose"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-euscript.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
