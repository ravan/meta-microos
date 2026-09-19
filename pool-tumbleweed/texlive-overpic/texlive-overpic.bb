SUMMARY = "Combine LaTeX commands over included graphics"
DESCRIPTION = "The overpic environment is a cross between the LaTeX picture \
environment and the \\includegraphics command of graphicx. The \
resulting picture environment has the same dimensions as the \
included graphic. LaTeX commands can be placed on the graphic \
at defined positions; a grid for orientation is available."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77682"

RPM_NAME = "texlive-overpic-2026.226.2.2svn77682-58.2.noarch.rpm"
RPM_HASH = "7670fa2f251b9f14c5cdff0b4995431e2be4267c1acbb4862998b62928b6376aaef7ab2b7e9f2440d0d59d5949cc1de8fd5211b5ffcb1a81a3052468507fd811"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overpic.sty \
texlive-overpic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epic.sty \
tex-graphicx.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
