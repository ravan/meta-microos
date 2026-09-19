SUMMARY = "Diagrams of sphere models for variably strict conditionals (Lewis counterfactuals)"
DESCRIPTION = "David K. Lewis (Counterfactuals, Blackwell 1973) introduced a \
sphere semantics for counterfactual conditionals. He jokingly \
referred to the diagrams depicting such sphere models as \
Ptolemaic astronomy, hence the name of this package. The macros \
provided in this package aid in the construction of sphere \
model diagrams in the style of Lewis. The macros all make use \
of TikZ."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn50810"

RPM_NAME = "texlive-ptolemaicastronomy-2026.226.1.0svn50810-60.4.noarch.rpm"
RPM_HASH = "57cb5d0d1bd00899fbf65cab852362caf853a1d5ed7f907be30b8070397dfe17b6740f548e7675aa305ba931f10d45d85d2e618067b513fab0e65895e564a544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptolemaicastronomy.sty \
texlive-ptolemaicastronomy"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
