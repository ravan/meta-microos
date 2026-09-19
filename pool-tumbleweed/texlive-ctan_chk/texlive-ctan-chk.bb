SUMMARY = "CTAN guidelines verifier and corrector for uploading projects"
DESCRIPTION = "Basic gawk program that uses CTAN's published guidelines for \
authors to help eliminate sloppiness in uploaded \
files/projects. It is completely open for users to program \
additional guidelines as well as CTAN's future adjustments."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.0svn36304"

RPM_NAME = "texlive-ctan_chk-2026.226.1.0svn36304-61.2.noarch.rpm"
RPM_HASH = "005c562f3df96a2ab53502687945986550f9b878157036cc21adbfccee38465b504d42cedcc251ffdb23ae13d29359361e89aceb2401ff181ef471acef2107d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctan-chk"

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
