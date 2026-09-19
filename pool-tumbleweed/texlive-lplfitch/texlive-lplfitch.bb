SUMMARY = "Fitch-style natural deduction proofs"
DESCRIPTION = "The package provides macros for typesetting natural deduction \
proofs in 'Fitch' style, with subproofs indented and offset by \
scope lines. The proofs from use of the package are in the \
format used in the textbook 'Language, Proof, and Logic' by \
Dave Barker-Plummer, Jon Barwise, and John Etchemendy. (In \
fact, the prefix 'lpl' in the package name stands for \
'Language, Proof, and Logic'.)"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9svn75712"

RPM_NAME = "texlive-lplfitch-2026.226.0.0.9svn75712-61.2.noarch.rpm"
RPM_HASH = "7c3536b6e7290d2e3c0091d32cb9851aebc5539b7988f3dadb9a4b56a91a81e25c9444db4462f284c281016a9d9369df49f5cd8fad06ff678827d161fc7e21eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lplfitch.sty \
texlive-lplfitch"

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
