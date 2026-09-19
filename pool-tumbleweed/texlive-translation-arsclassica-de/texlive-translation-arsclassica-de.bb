SUMMARY = "German version of arsclassica"
DESCRIPTION = "This is a 'translation' of the arsclassica documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23803"

RPM_NAME = "texlive-translation-arsclassica-de-2026.226.svn23803-59.2.noarch.rpm"
RPM_HASH = "24a97e73f8cd9e09530bd0d229aca5f627f9d2c06514dda79b2a31e606f4827a3c251c1c9ad20988b51b73794d68122398dfb92e94b8e33eef7dd9a5b4a0311e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translation-arsclassica-de"

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
