SUMMARY = "Get package or file date"
DESCRIPTION = "The package can fetch the date declaration of packages and \
files used by a document, and then provide the information in \
macros. The facilities provide a means of obtaining the date of \
a package being documented; this is mainly of use when \
doc/docstrip."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-zwgetfdate-2026.226.svn15878-59.4.noarch.rpm"
RPM_HASH = "509223a683f3ffe3f850436625a90db395b4df5baca493a873faa102a7df8b3de3db91e6ca317f0c0e555f2c8bd01fc63b431a077c37dfe82ec6cd594c84efa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zwgetfdate.sty \
texlive-zwgetfdate"

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
