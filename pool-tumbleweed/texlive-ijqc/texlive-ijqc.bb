SUMMARY = "BibTeX style file for the Intl. J. Quantum Chem"
DESCRIPTION = "ijqc.bst is a BibTeX style file to support publication in \
Wiley's International Journal of Quantum Chemistry. It is not \
in any way officially endorsed by the publisher or editors, and \
is provided without any warranty one could ever think of."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76790"

RPM_NAME = "texlive-ijqc-2026.226.1.2svn76790-60.2.noarch.rpm"
RPM_HASH = "1bc07e2397ff77e649971ef29b0b5833b4a64528003bf4640f2e79ee186ef0100def7a77da9a3079657d9b89a71774b7b722f0561252bb1f8e27895ebed75afd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijqc"

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
