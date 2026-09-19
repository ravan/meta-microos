SUMMARY = "Generic handling of TeX category codes"
DESCRIPTION = "The bundle deals with category code switching; the packages of \
the bundle should work with any TeX format (with the support of \
the plainpkg package). The bundle provides stacklet.sty, which \
supports stacks that control the use of different catcodes; \
actcodes.sty, which deals with active characters; and \
catchdq.sty, which provides a simple quotation character \
control mechanism."
LICENSE = "LPPL-1.0"

PV = "2026.226.r0.2svn38859"

RPM_NAME = "texlive-catcodes-2026.226.r0.2svn38859-59.2.noarch.rpm"
RPM_HASH = "5a7e38142d82a98e67a64a645a4a2d9e742e88d79a703bcd48d77757e1ef645cd020336fcc9bb2740a8f9e978d3cc3b9115620f8156cdfce2c0c82f467a9426a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-actcodes.sty \
tex-catchdq.sty \
tex-stacklet.sty \
texlive-catcodes"

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
