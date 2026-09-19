SUMMARY = "Diagrams consisting of boxes, lines, and annotations"
DESCRIPTION = "A MetaPost package providing facilities to assist in drawing \
diagrams that consist of boxes, lines, and annotations. \
Particular support is provided for creating EXPRESS-G diagrams, \
for example IDEF1X, OMT, Shlaer-Mellor, and NIAM diagrams. The \
package may also be used to create UML and most other \
Box-Line-Annotation charts, but not Gantt charts directly."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn29349"

RPM_NAME = "texlive-expressg-2026.226.1.5svn29349-59.2.noarch.rpm"
RPM_HASH = "cc443c01d2f96a2d264e2199979777b3217728970fc5539ae17964b17498fce886bf3938083032a8ca777c3829ef19a40cb06a7f20abce8ca8d6edb52234e19c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expressg"

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
