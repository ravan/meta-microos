SUMMARY = "Execute stuff at \\shipout time"
DESCRIPTION = "This package is a modern reimplementation of package everyshi, \
providing various commands to be executed before a \\shipout \
command. It makes use of e-TeX's facilities if they are \
available. The package may be used either with LaTeX or with \
plain TeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn77682"

RPM_NAME = "texlive-atbegshi-2026.226.1.19svn77682-60.2.noarch.rpm"
RPM_HASH = "9a4ef960880bf20d2fdca3b196f5ef9c3c119f74c5d7245653b183a9eb0c0cefce8408ef644742b0d6817d6d2f1f2ae2b3ddee3221b730e9ab304e5ed71f0350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atbegshi.sty \
texlive-atbegshi"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
