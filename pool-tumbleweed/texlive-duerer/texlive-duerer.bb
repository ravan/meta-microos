SUMMARY = "Computer Duerer fonts"
DESCRIPTION = "These fonts are designed for titling use, and consist of \
capital roman letters only. Together with the normal set of \
base shapes, the family also offers an informal shape. The \
distribution is as Metafont source. LaTeX support is available \
in the duerer-latex bundle."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn20741"

RPM_NAME = "texlive-duerer-2026.226.svn20741-59.2.noarch.rpm"
RPM_HASH = "3f1b24fc52775d5c6a52ed993f64cb892d19b74d2da30c5f8cd8176e3a80baec046f3216088702f08389b27d8d6dfcb953e3092361abfeced1efbb4fd3a2134c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cdb10.tfm \
tex-cdi10.tfm \
tex-cdr10.tfm \
tex-cdsl10.tfm \
tex-cdss10.tfm \
tex-cdtt10.tfm \
texlive-duerer"

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
