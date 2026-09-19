SUMMARY = "A loop facility for Generic TeX"
DESCRIPTION = "The package provides the \\multido command, which was originally \
designed for use with PSTricks. Fixed-point arithmetic is used \
when working on the loop variable, so that the package is \
equally applicable in graphics applications like PSTricks as it \
is with the more common integer loops."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.42svn77682"

RPM_NAME = "texlive-multido-2026.226.1.42svn77682-61.2.noarch.rpm"
RPM_HASH = "851d1e76ff824f931e0bc0a32fab1e423f5a2fb1002c760b196baee32ef6af3ae1c24c366bc00ff66e49f9b80f70066bc9b3fee039fec7d7be023863bc60d39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multido.sty \
tex-multido.tex \
texlive-multido"

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
