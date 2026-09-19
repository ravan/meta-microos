SUMMARY = "Babel support for Upper and Lower Sorbian"
DESCRIPTION = "The package provides language definitions file for support of \
both Upper and Lower Sorbian, in babel. Some shortcuts are \
defined, as well as translations to the relevant language of \
standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0jsvn77682"

RPM_NAME = "texlive-babel-sorbian-2026.226.1.0jsvn77682-60.2.noarch.rpm"
RPM_HASH = "ed03e4ff2aa78e4020c9bef2a89755cc4481a6e05dad50d0d6c184ae21488c9c4374c528aa6f461ffcc8d51b109cffa2d56e90979775ffec94112f935f9efea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lsorbian.ldf \
tex-usorbian.ldf \
texlive-babel-sorbian"

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
