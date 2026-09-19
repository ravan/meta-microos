SUMMARY = "Automatically typeset the academic year (French way)"
DESCRIPTION = "This package provides a macro \\anneescolaire to automatically \
write the academic year in the French way, according to the \
date of compilation, two other macros to obtain the first and \
the second calendar year of the academic year, a macro to be \
redefined to change the presentation of the years."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn76924"

RPM_NAME = "texlive-annee-scolaire-2026.226.1.6svn76924-61.2.noarch.rpm"
RPM_HASH = "ba6c8dce100ed6b1447dc08dd94d8ceead02f43ea94318ce36e681caf6f3179bedb1836f424105e9f3d141df3e00d4dce45d884df04a5f18afe140b27cdf6d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-annee-scolaire.sty \
texlive-annee-scolaire"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
