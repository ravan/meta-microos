SUMMARY = "Count pages in a document, and report last page number"
DESCRIPTION = "The package counts the actual pages in the document (as opposed \
to reporting the number of the last page, as does lastpage). \
The counter itself may be shipped out to the DVI file. The \
package uses the everyshi package for its task."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.00svn77682"

RPM_NAME = "texlive-totpages-2026.226.2.00svn77682-59.2.noarch.rpm"
RPM_HASH = "d395b84ddee03b9d88a8faf7108825b5f070c7ddc6ab093fee5160b3f01a640818eae2f45bf3cf3792de3da5061fb3c68b10138dba1259fb98fce94c1ddf5dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-totpages.sty \
texlive-totpages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everyshi.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
