SUMMARY = "Compute the mass of a printed version of a document"
DESCRIPTION = "The package computes the number of sheets of paper used by, and \
hence the mass of a document. This is useful (for example) when \
calculating postal charges."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn66835"

RPM_NAME = "texlive-papermas-2026.226.1.1asvn66835-58.2.noarch.rpm"
RPM_HASH = "55acdbf945e5ca896d61b8699176ed878f8ed7aeae55254e6b883a7596535f38889d45746f6f1aa545f9cf6db59c981f959034e76a8596b92ef6de76e3c6662f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-papermas.sty \
texlive-papermas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-intcalc.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
