SUMMARY = "Highlighting of Python code, based on the listings package"
DESCRIPTION = "Highlighting of Python code, based on the listings package."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn70698"

RPM_NAME = "texlive-pythonhighlight-2026.226.svn70698-60.4.noarch.rpm"
RPM_HASH = "b644a1a7c53d6856639d0279e288fd24827059c1803e98363564832699a16bb9840bd2c866113251fb9712382ef1b780b06ef909b31ee2e7d9b0d5c4525ea4e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pythonhighlight.sty \
texlive-pythonhighlight"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
