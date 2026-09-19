SUMMARY = "Find fonts that contain a given glyph"
DESCRIPTION = "This is a command line tool for finding fonts that contain a \
given (Unicode) glyph. It relies on Fontconfig."
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.5.1svn73436"

RPM_NAME = "texlive-albatross-2026.226.0.0.5.1svn73436-61.2.noarch.rpm"
RPM_HASH = "e3e6a83089939a0fe05cf11372847cfeb88c3318be1ba2be38298db619d542b0401c864c4242454a29c42cdd6c438b853b802a7cb2c42f03ee800b8f14ed6ac5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-albatross.jar \
texlive-albatross"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-albatross-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
