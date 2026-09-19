SUMMARY = "Yet another TeX compilation tool: simple, human readable, no option, no magic"
DESCRIPTION = "SpiX offers a way to store information about the compilation \
process for a tex file inside the tex file itself. Just write \
the commands as comments in the tex files, and SpiX will \
extract and run those commands. Everything is stored in the tex \
file (so that you are not missing some piece of information \
that is located somewhere else), in a human-readable format (no \
need to know SpiX to understand it)."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.3.0svn65050"

RPM_NAME = "texlive-spix-2026.226.1.3.0svn65050-64.2.noarch.rpm"
RPM_HASH = "b18e0c59c429bed6863f0253465b9a90d97fc0dd391a040c72a15d234c57ad87c10c75318fe7a8480e15301f03f835c9f6e8be94216c5453213b25b45ad39bf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spix"

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
texlive-scripts-bin \
texlive-spix-bin"

inherit rpm
