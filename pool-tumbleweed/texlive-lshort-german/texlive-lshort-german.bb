SUMMARY = "German version of 'A Short Introduction to LaTeX2e': LaTeX2e-Kurzbeschreibung"
DESCRIPTION = "The lshort-german package"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0csvn70740"

RPM_NAME = "texlive-lshort-german-2026.226.3.0csvn70740-61.2.noarch.rpm"
RPM_HASH = "970f6570f30506d0578c6d3d8a3a22cc251823b167ca82aa79ea66233ff289681c464c851f1ebd72e1a5b72b40f75d9143a27092e647f34559611acfdcb91913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-german"

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
