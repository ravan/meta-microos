SUMMARY = "Declare active character substitution, robustly"
DESCRIPTION = "The package provides macros \\DeclareRobustActChar and \
\\ReDeclareRobActChar. One uses \\DeclareRobustActChar in the \
same way one would use \\DeclareRobustCommand; the macro \
\\protects the active character when it appears in a moving \
argument. \\ReDeclareRobActChar redefines an active character \
previously defined with \\DeclareRobustActChar, in the same way \
that \\renewcommand works for ordinary commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn15878"

RPM_NAME = "texlive-drac-2026.226.1svn15878-59.2.noarch.rpm"
RPM_HASH = "ebb5e49e9d9fd54f51802082a42588cf774ec0b604113ec4ac17512718ee3cff364f9499fe178a050facfcf3edbff992a8098babe8b5a3b745cea02f98c13bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-drac.sty \
texlive-drac"

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
