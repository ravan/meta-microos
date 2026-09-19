SUMMARY = "Objects and proxies in LaTeX3"
DESCRIPTION = "This package introduces a new mechanism to create objects like \
the well known C structures. The functions exported by this \
package are quite low level, and many important mechanisms like \
member protection and name resolution aren't already defined \
and should be introduced by intermediate packages."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.3svn76924"

RPM_NAME = "texlive-lt3rawobjects-2026.226.2.3svn76924-59.2.noarch.rpm"
RPM_HASH = "f2f1ed71644a6ab4060ebd67bc7c9e9b9b82f2b1337ef6aede91828e88a73bd6493d1d5d10fdf235c7f99a64617d2260e068e885b5a75dfce12ff74778c5dd75"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lt3rawobjects.sty \
texlive-lt3rawobjects"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
