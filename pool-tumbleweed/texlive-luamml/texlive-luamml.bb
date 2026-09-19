SUMMARY = "Automatically generate MathML from LuaLaTeX math mode material"
DESCRIPTION = "LuaMML is an experimental package to automatically generate a \
MathML representation of mathematical expressions written in \
LuaLaTeX documents. These MathML representations can be used \
for improving accessibility or to ease conversion into new \
output formats like HTML."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.0svn78219"

RPM_NAME = "texlive-luamml-2026.226.0.0.8.0svn78219-59.2.noarch.rpm"
RPM_HASH = "2ee3f09695764b4e4adfe69b39a755a5c2f45ff73523efbc2fdc0ae8a88e26b92321123f2ef2660ca7ec9137d152a33a5a9d48565f08a4031c1497cc7f45ec2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamml-patches-amsmath.sty \
tex-luamml-patches-kernel.sty \
tex-luamml-pdf.sty \
tex-luamml.sty \
texlive-luamml"

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
