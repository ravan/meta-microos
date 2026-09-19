SUMMARY = "Ecv documentation, in German"
DESCRIPTION = "This is a 'translation' of the ecv documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn24754"

RPM_NAME = "texlive-translation-ecv-de-2026.226.svn24754-59.2.noarch.rpm"
RPM_HASH = "8977bd1c6cde696c180337c645c78522e45139a827d522b79b13fb6c82b8811c5dcb531de01ea3e48697e7da06413b871abda4511fb6c2d44deeeab4b80785c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-ecv-de"

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
