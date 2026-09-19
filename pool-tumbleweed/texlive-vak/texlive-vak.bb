SUMMARY = "BibTeX style for Russian Theses, books, etcetera"
DESCRIPTION = "The file can be used to format the bibliographies of PhD \
theses, books etc., according to the latest Russian standards: \
GOST 7.82 - 2001 and GOST 7.1 - 2003. It introduces the minimum \
number of new entries and styles to cover all frequently used \
situations. The style file provides an easy way to perform a \
semiautomatic, or a completely manual sort of the list of the \
references. Processing bibliographies produced by the style \
requires a 8-bit BibTeX system."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn75878"

RPM_NAME = "texlive-vak-2026.226.svn75878-60.2.noarch.rpm"
RPM_HASH = "1b1b358086949efd0e3b51bcfacf7cdb6badd38c308488b46edcb0cbbba2a2e5bb1be360e754567368b1d4ec99785379b93bd61a44df8639fbc6c296cc4c5ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vak"

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
