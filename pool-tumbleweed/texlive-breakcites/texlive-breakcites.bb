SUMMARY = "Ensure that multiple citations may break at line end"
DESCRIPTION = "Makes a very minor change to the operation of the \\cite \
command. Note that the change is not necessary in unmodified \
LaTeX; however, there remain packages that restore the \
undesirable behaviour of the command as provided in LaTeX 2.09. \
(Note that neither cite nor natbib make this mistake.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn78101"

RPM_NAME = "texlive-breakcites-2026.226.svn78101-59.2.noarch.rpm"
RPM_HASH = "9afaf28e3c32c2c525babaf72832a3818642a91ceceba97efbf76fac42ffb3e00f87e3f9d1758b19b4bc2725c571d5c8bcab52b86c028a809ee2f1926b006823"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-breakcites.sty \
texlive-breakcites"

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
