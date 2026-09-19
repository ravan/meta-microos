SUMMARY = "To retain the original caption names when using Babel"
DESCRIPTION = "This package forces the caption names (\\chaptername, \\today, \
etc) declared by the document class in use to be used as the \
caption names for a specific language introduced by the Babel \
package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn64072"

RPM_NAME = "texlive-bxorigcapt-2026.226.1.0svn64072-59.2.noarch.rpm"
RPM_HASH = "fdef4be76ed00623c6d150a8d0d084e4a795f098b35b8a7a59558a1146c757c628504bf358c5f6d93d80cc220cec846a4c357c27828c9ade25086e910a225c74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxorigcapt.sty \
texlive-bxorigcapt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
