SUMMARY = "Split long sequences of characters in a neutral way"
DESCRIPTION = "When one needs to type long sequences of letters (such as in \
base-sequences in genes) or of numbers (such as calculations of \
transcendental numbers), there's no obvious break points to be \
found. The package provides a command \\seqsplit, which makes \
its argument splittable anywhere, and then leaves the TeX \
paragraph-maker to do the splitting. While the package may \
obviously be used to typeset DNA sequences, the user may \
consider the dnaseq as a rather more powerful alternative."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-seqsplit-2026.226.0.0.1svn77682-60.2.noarch.rpm"
RPM_HASH = "6a27fadb20b8dda06876b4ef0e20573a310ab456803448d57260668cfbab23e6c841fcba3532d85028a89b7cfdfebb38a33bf3c1fdf0f990332ad0baa69ffb4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seqsplit.sty \
texlive-seqsplit"

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
