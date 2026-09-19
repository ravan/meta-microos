SUMMARY = "Create an overview of pictures from a digital camera or from other sources"
DESCRIPTION = "The class may be used to create an overview of pictures from a \
digital camera or from other sources. It is possible to adjust \
the size of the pictures and all the margins. The example file \
shows the usage."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0jsvn15878"

RPM_NAME = "texlive-image-gallery-2026.226.1.0jsvn15878-60.2.noarch.rpm"
RPM_HASH = "bdce01156fc18056f74f6e4d0e17c3a485ce4998cab646e0b31d0824d432f9f7456fec78d7cc30401744b564c26b48fa0163ce4fed5bc11d5a56624f2fbbe8d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-image-gallery.cls \
texlive-image-gallery"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
