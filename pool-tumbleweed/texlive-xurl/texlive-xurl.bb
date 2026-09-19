SUMMARY = "Allow URL breaks at any alphanumerical character"
DESCRIPTION = "This package loads url by default and defines possible URL \
breaks for all alphanumerical characters, as well as = / . : * \
- ~ ' ' All arguments which are valid for url can be used and \
will be passed on to this package. For more information read \
the documentation of url itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10svn77682"

RPM_NAME = "texlive-xurl-2026.226.0.0.10svn77682-59.4.noarch.rpm"
RPM_HASH = "2877870d25c9c74199916c3d21cd57200941329a8006f546e1e8d5d6e275e866f9c87d65f202409b2cc0a7595e16c5e2daea9233aea6c34df2ecb250a45bfa59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xurl.sty \
texlive-xurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
