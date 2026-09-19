SUMMARY = "Longtable support with possible X-column specifier"
DESCRIPTION = "This package loads package ltablex, but keeps the current \
tabularx environment as is. The new environment xltabular is a \
combination of longtable and tabularx: Header/footer \
definitions, X-column specifier, and with possible pagebreaks."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0isvn77682"

RPM_NAME = "texlive-xltabular-2026.226.2.0isvn77682-59.4.noarch.rpm"
RPM_HASH = "74177a0053314e9429b0da65a470636e0f225d0bd3570bd0e26c72d44463f63feeaa775dfe25cf4c74cb7affed70cf56b0e21f6f34e6a481499a461339cd0b94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xltabular.sty \
texlive-xltabular"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ltablex.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
