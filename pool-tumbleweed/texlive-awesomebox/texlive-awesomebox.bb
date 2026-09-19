SUMMARY = "Draw admonition blocks in your documents, illustrated with FontAwesome icons"
DESCRIPTION = "Awesome Boxes is all about drawing admonition blocks around \
text to inform or alert readers about something particular. The \
specific aim of this package is to use FontAwesome icons to \
ease the illustration of these blocks. The package depends on \
fontawesome5, xcolor, array and xparse."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn57349"

RPM_NAME = "texlive-awesomebox-2026.226.0.0.6svn57349-60.2.noarch.rpm"
RPM_HASH = "0db76d0eacba18aa24faa6cefbaf0911248420fe612268aca58191a88278cb026e9c472ad49a1913cd05809ff2dc30e3d0ba20368edc3c1c66479249a3506af8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-awesomebox.sty \
texlive-awesomebox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-fontawesome5.sty \
tex-ifthen.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
