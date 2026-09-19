SUMMARY = "Set various page dimensions"
DESCRIPTION = "Provides a macro to set various margins as well as dimensions \
for header/footer and page dimensions. Most common paper sizes, \
paper orientation, disabling of headers and footers, and two \
sided printing are supported. The vmargin package does not rely \
on other packages and was designed with speed and size in mind. \
Its user interface might not be very fancy, but it's fast, \
small, and gets the job done. If you are looking for something \
more elaborate try the geometry package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn15878"

RPM_NAME = "texlive-vmargin-2026.226.2.5svn15878-60.2.noarch.rpm"
RPM_HASH = "b1a96c62a9876c9cf9da29f5ba5d822111de9ef4586dd2136241957dc7151d21f61369ca144313c7f03322659bc28aca8e6ccb8bee74cd9c403fa34d2a6ae0e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vmargin.sty \
texlive-vmargin"

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
