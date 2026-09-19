SUMMARY = "Compute and display CVSS base scores"
DESCRIPTION = "The Common Vulnerability Scoring System (CVSS) is an open \
framework for communicating the characteristics and severity of \
software vulnerabilities. CVSS consists of three metric groups: \
Base, Temporal, and Environmental. This package allows the user \
to compute CVSS3.1 base scores and use them in documents, i.e. \
it only deals with the Base score. Temporal and Environmental \
scores will be part of a future release. More information can \
be found at https://www.first.org/cvss/specification-document."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn76924"

RPM_NAME = "texlive-cvss-2026.226.1.1.0svn76924-61.2.noarch.rpm"
RPM_HASH = "7d86fbf45f00a41cd10688428b6bb44b22d957b7d9b65487ddb77b28134f57982ac892917a0911cfb41ddfbdefe47268bc4ca3e41007751c8d5e4281af889c99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cvss.sty \
texlive-cvss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-hyperref.sty \
tex-tcolorbox.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
