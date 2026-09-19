SUMMARY = "Produce formatted program listings"
DESCRIPTION = "The listing environment is provided and is similar to figure \
and table, although it is not a floating environment. Includes \
support for \\caption, \\label, \\ref, and introduces \
\\listoflistings, \\listingname, \\listlistingname. It produces a \
.lol file. It does not change \\@makecaption (unless the option \
bigcaptions is used), so packages that change the layout of \
\\caption still work."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn17373"

RPM_NAME = "texlive-listing-2026.226.1.2svn17373-61.2.noarch.rpm"
RPM_HASH = "7ca40c21a5e6ef8ab57d5524a797e0bf0e398157c0649e9c415daa6e41a88a3652acb692ae4daf1be36ef6e714725c6674545edc71a28365f24c10ab3ef7ea5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-listing.sty \
texlive-listing"

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
