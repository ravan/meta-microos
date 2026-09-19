SUMMARY = "Generate new LaTeX command definitions"
DESCRIPTION = "Generating any other than the simple \\newcommand-style \
commands, in LaTeX, is tedious (in the least). This script \
allows the specification of commands in a 'natural' style; the \
script then generates macros to define the command."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn18704"

RPM_NAME = "texlive-newcommand-2026.226.2.0svn18704-61.2.noarch.rpm"
RPM_HASH = "bd4184c1a95b7eb19d1ab64a7f64f18e9a3bf972e01efe08b059ef04702b50c908bb37fee58c882e71f1170afbe234cadf98ad42204794022a8f1cb40b218f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcommand"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
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
