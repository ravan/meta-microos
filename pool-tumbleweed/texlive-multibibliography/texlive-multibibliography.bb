SUMMARY = "Multiple versions of a bibliography, with different sort orders"
DESCRIPTION = "Conventional standards for bibliography styles impose a forced \
choice between index and name/year citations, and corresponding \
references. The package avoids this choice, by providing \
alphabetic, sequenced, and even chronological orderings of \
references. Inline citations, that integrate these \
heterogeneous styles, are also supported (and work with other \
bibliography packages)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-multibibliography-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "02c37b02e035bf3c5a6956aabdaa55169378983a63dbdf84d1bc4d3aed130091fb51f4b5a8c5994eb2bfc08026d5e0cebdde24c2f69b1cf7e31aba5cf27ab520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibibliography.sty \
texlive-multibibliography"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-multibibliography-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
