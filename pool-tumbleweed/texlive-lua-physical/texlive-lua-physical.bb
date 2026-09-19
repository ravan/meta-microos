SUMMARY = "Functions and objects for the computation of physical quantities"
DESCRIPTION = "This is a pure Lua library, which provides functions and \
objects for the computation of physical quantities. The package \
provides units of the SI and the imperial system. In order to \
display the numbers with measurement uncertainties, the package \
is able to perform Gaussian error propagation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.5svn59138"

RPM_NAME = "texlive-lua-physical-2026.226.1.0.5svn59138-59.2.noarch.rpm"
RPM_HASH = "80515c760e9d4d74ccfb297449cdc10a7aedccb22ba8b9b75f82876f7b30c4fb3f14c3a574b1526cdeed371341ff1e5780742b8230dab133d2c8f54d68fb6e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-physical"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
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
