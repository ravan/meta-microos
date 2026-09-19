SUMMARY = "On-the-fly download of missing TeX Live packages"
DESCRIPTION = "The package provides a script that performs 'on the fly' \
downloads of missing packages, while a document is being \
compiled. (This feature is already available in the MiKTeX \
distribution for Windows machines.) To use the script, replace \
your (LaTeX) compilation command with texliveonfly.py file.tex \
(default options are --engine=pdflatex and \
--arguments='-synctex=1 -interaction=nonstopmode', which may \
all be changed). The script is designed to work on Linux \
distributions."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.svn76924"

RPM_NAME = "texlive-texliveonfly-2026.227.svn76924-62.2.noarch.rpm"
RPM_HASH = "ab63736820187d3d7b38eebe4768d3fcc4e9c277233111e7e9d749b89f2b96d4192c4c530335bcb40161ead104edeed8e20beb37b8a21d0b57cc35b27bc512c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texliveonfly"

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
texlive-texliveonfly-bin"

inherit rpm
