SUMMARY = "Commands useful in LaTeX templates"
DESCRIPTION = "The package provides a collection of tools, which are helpful \
for the creation of a LaTeX template if conditional paths for \
code execution are required. All the commands work both in the \
preamble and in the document."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2svn67201"

RPM_NAME = "texlive-templatetools-2026.227.0.0.2svn67201-62.2.noarch.rpm"
RPM_HASH = "e96e5b5fa181d159783bd5e29d0a59290a7dedf4a5f971e3df991dab3261d35b94b2d0328b13f01b8f0d1318d73a5b371c901ed01271e6ed7f9681ba0df9a168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-templatetools.sty \
texlive-templatetools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-etoolbox.sty \
tex-ifdraft.sty \
tex-iftex.sty \
tex-ltxcmds.sty \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
