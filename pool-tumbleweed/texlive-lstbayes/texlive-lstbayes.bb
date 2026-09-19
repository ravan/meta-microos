SUMMARY = "Listings language driver for Bayesian modeling languages"
DESCRIPTION = "The package provides language drivers for the listings package \
for several languages not included in that package: BUGS, JAGS, \
and Stan."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn48160"

RPM_NAME = "texlive-lstbayes-2026.226.svn48160-59.2.noarch.rpm"
RPM_HASH = "a735dd3cab31411dc3725f546b4782b4ffd22c65726276d083352f2d56193ee1136b3ea8c7e96b01ef4505148e2c6285e084fd36fdd351d2e7faa3f307732035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstbayes.sty \
texlive-lstbayes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
