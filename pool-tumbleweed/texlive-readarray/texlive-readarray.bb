SUMMARY = "Read, store and recall array-formatted data"
DESCRIPTION = "The package allows the user to input formatted data into \
elements of a 2-D or 3-D array and to recall that data at will \
by individual cell number. The data can be but need not be \
numerical in nature. It can be, for example, formatted text. \
While the package can be used for any application where indexed \
data is called for, the package proves particularly useful when \
elements of multiple arrays must be recallable and dynamically \
combined at time of compilation, rather than in advance."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn60540"

RPM_NAME = "texlive-readarray-2026.226.3.1svn60540-60.4.noarch.rpm"
RPM_HASH = "f65849a347a75175827fac989721136c1d83f08064d06e8ab524c3045559344474b2875e8065e8b1163821258af81a3c23f016d5fbaf7d36d459bab91ca6ce58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-readarray.sty \
texlive-readarray"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-forloop.sty \
tex-ifthen.sty \
tex-listofitems.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
