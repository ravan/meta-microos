SUMMARY = "XML mastering for LaTeX classes and packages"
DESCRIPTION = "The package provides an experiment in using XML (specifically \
DocBook 5) to mark up and maintain LaTeX classes and packages. \
XSLT 2 styleheets generate the .dtx and .ins distribution files \
expected by end users."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.19svn55218"

RPM_NAME = "texlive-classpack-2026.226.1.19svn55218-60.2.noarch.rpm"
RPM_HASH = "388030db9012e5e8792456a0f0230582285865abb780f825176f0fa01e968c1b7a8c5beaada58aa331c1d21dd24c13ca4b8ed20b629f2737287a652be5570856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-classpack.sty \
texlive-classpack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-graphicx.sty \
tex-marginnote.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
