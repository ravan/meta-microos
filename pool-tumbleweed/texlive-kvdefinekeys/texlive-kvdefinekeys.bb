SUMMARY = "Define keys for use in the kvsetkeys package"
DESCRIPTION = "The package provides a macro \\kv@define@key (analogous to \
keyval's \\define@key, to define keys for use by kvsetkeys."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-kvdefinekeys-2026.226.1.6svn77682-63.2.noarch.rpm"
RPM_HASH = "f8e95980d2b88f64fd113493aadd435750744ec422d59e5d276cda5bb7f6ef14f77be3daef3c1619e1f914ed13f64fe7ae242e2dda4ebd1da7a41189ad092d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvdefinekeys.sty \
texlive-kvdefinekeys"

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
