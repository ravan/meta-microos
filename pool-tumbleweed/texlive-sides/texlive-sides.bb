SUMMARY = "A LaTeX class for typesetting stage plays"
DESCRIPTION = "This is a LaTeX class for typesetting stage plays, based on the \
plari class written by Antti-Juhani Kaijanaho in 1998. It has \
been updated and several formatting changes have been made to \
it--most noticeably there are no longer orphans."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-sides-2026.226.svn76924-60.2.noarch.rpm"
RPM_HASH = "1332b80116ba25b7ff671850c7c476bc1bb3943c19f68f39a27d5bdc8f5bffec46dc5c62afb18d02b8ad5d8346ad3e41b0aaaf87c2e14a5c63ae9cc8a2720d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sides.cls \
texlive-sides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
