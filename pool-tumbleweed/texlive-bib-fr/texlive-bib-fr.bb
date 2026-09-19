SUMMARY = "French translation of classical BibTeX styles"
DESCRIPTION = "These files are French translations of the classical BibTeX \
style files. The translations can easily be modified by simply \
redefining FUNCTIONs named fr.*, at the beginning (lines \
50-150) of each file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76790"

RPM_NAME = "texlive-bib-fr-2026.226.1.5svn76790-61.2.noarch.rpm"
RPM_HASH = "7dce50d4f8009e306a90797d6f545717ed29453cbfbdee1b9a28db6c3af2be2ac3a9be44a19c90479d91e1d02aed96e2287ff773e330a1d2b0655406800aad27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib-fr"

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
