SUMMARY = "A list of internal LaTeX2e macros"
DESCRIPTION = "This document lists the internal macros defined by the LaTeX2e \
base files which can also be useful to package authors. The \
macros are hyper-linked to their description in source2e. For \
this to work both PDFs must be inside the same directory. This \
document is not yet complete in content and format and may miss \
some macros."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn77050"

RPM_NAME = "texlive-macros2e-2026.226.0.0.4asvn77050-59.2.noarch.rpm"
RPM_HASH = "6a88579faec0cb22dc65a7098ea08bca0bd4a510d912a0036d723920685cc3a1febdb02f43314cd37fe5c8fef4cd847b2cda7e76a984be06dc385c88cc96a81b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-extlabels.sty \
texlive-macros2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-lipsum.sty \
tex-zref-abspos.sty \
tex-zref-user.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
