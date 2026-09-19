SUMMARY = "Babel contributed support for Bulgarian"
DESCRIPTION = "The package provides support for documents in Bulgarian (or \
simply containing some Bulgarian text)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2gsvn31902"

RPM_NAME = "texlive-babel-bulgarian-2026.226.1.2gsvn31902-60.2.noarch.rpm"
RPM_HASH = "cd1a641a2421d8e6773b6bd9c4b9256f53649644db6e0c1c63cdff729a49d80fbef1d67c3e97eee938a742cb497af796fb2508c6ef4808a4719290e20710d270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bulgarian.ldf \
texlive-babel-bulgarian"

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
