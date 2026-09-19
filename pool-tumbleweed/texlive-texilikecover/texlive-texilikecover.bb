SUMMARY = "A cover-page package, like TeXinfo"
DESCRIPTION = "The package creates document cover pages, like those that \
TeXinfo produces."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1svn15878"

RPM_NAME = "texlive-texilikecover-2026.227.0.0.1svn15878-62.2.noarch.rpm"
RPM_HASH = "dea0742e278a4f747e1f9f1fe15535a3bdb021507ec6da1e790313415c63104277582bbcac0ed97edca716c9168c783fba6c983f5dccbb704bec37210a475202"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texilikecover.sty \
texlive-texilikecover"

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
