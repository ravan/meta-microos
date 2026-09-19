SUMMARY = "Extend the doc package"
DESCRIPTION = "The doc package provides LaTeX developers with means to \
describe the usage and the definition of new macros and \
environments. However, there is no simple way to extend this \
functionality to other items (options or counters, for \
instance). The DoX package is designed to circumvent this \
limitation."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn46011"

RPM_NAME = "texlive-dox-2026.226.2.4svn46011-59.2.noarch.rpm"
RPM_HASH = "1f0711a6f48efd11fa7177910ad608bb96ea7a00c5cef3429f516ff3c47a905bed7d8b7d62a5c3f02d49afb4b77770d8512cd058d0d44ffb1281ae9f9c153fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dox.sty \
texlive-dox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
