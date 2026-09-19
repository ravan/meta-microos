SUMMARY = "Maths macros from chair X of Wurzburg University"
DESCRIPTION = "This package was developed by members of the chair for \
mathematical physics at the University of Wurzburg as a \
collection of macros and predefined environments for quickly \
creating nice mathematical documents. (Note concerning the \
package name: the 'n' stands for 'new', the 'X' is a roman 10.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn60196"

RPM_NAME = "texlive-nchairx-2026.226.1.0.0svn60196-61.2.noarch.rpm"
RPM_HASH = "bdbaa378ec5f40d288c6a337db691aca9fe93965dbc4ee33d8e5316fa698fcc157dd54c953962ab19c84f8f5fa6527a89845fcf381cf28b8e3cb4570dbdabb92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chairxmath.sty \
tex-nchairx.sty \
texlive-nchairx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-enumitem.sty \
tex-graphicx.sty \
tex-mathtools.sty \
tex-ntheorem.sty \
tex-suffix.sty \
tex-tensor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
