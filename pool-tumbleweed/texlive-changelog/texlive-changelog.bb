SUMMARY = "Typesetting keepachangelog.com style changelogs"
DESCRIPTION = "This package provides a changelog environment (which itself \
provides a version environment) to represent a changelog. The \
package supports multiple authors, unreleased changes, and \
yanked (revoked) releases. Inspired by keepachangelog.com."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6.1svn77682"

RPM_NAME = "texlive-changelog-2026.226.2.6.1svn77682-59.2.noarch.rpm"
RPM_HASH = "abb10e53e728cc6f85ce3efeb9326605741443bc1e85f7859c8b2b5917b02c61f1ed89c847a949e1a5e7457d2a46514f3c010b076670f7f8c3fed5e85af02d10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changelog.sty \
texlive-changelog"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-translations.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
