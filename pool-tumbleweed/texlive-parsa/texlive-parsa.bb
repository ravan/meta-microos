SUMMARY = "A XeLaTeX package for theses and dissertations at Iranian Universities"
DESCRIPTION = "A package for preparing dissertations and theses for Iranian \
universities as fast and as efficiently as possible. The \
package depends on xparse, fancyhdr, graphicx, multirow, float, \
and adjustbox."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn54840"

RPM_NAME = "texlive-parsa-2026.226.1.3svn54840-58.2.noarch.rpm"
RPM_HASH = "ac6eb10a56b5bed76e90a5947ecfd8d58d13ade48e5d49c73173417710af72877f4533f81577b0ee19f045f7a02c020f290d19e2c160439296ef564975593db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-parsa.sty \
texlive-parsa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-multirow.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
