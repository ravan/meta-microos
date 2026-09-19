SUMMARY = "Key value format for package options"
DESCRIPTION = "This package offers support for package authors who want to use \
options in key-value format for their package options."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.15svn77682"

RPM_NAME = "texlive-kvoptions-2026.226.3.15svn77682-63.2.noarch.rpm"
RPM_HASH = "ffea9bff971c1e8f8470a816a0d66a6fad1acc517952095683a3312409c5cf6ac409e1d045bf0e42402747e4f45553853b3bf3a4189f922826073dc933f02247"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvoptions-patch.sty \
tex-kvoptions.sty \
texlive-kvoptions"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etexcmds.sty \
tex-keyval.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
