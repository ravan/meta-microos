SUMMARY = "Cross references for named and numbered environments"
DESCRIPTION = "Philex provides means for creating and cross-referencing named \
or numbered environments. Possible uses would be equations, \
example sentences (as in linguistics or philosophy) or named \
principles. Cross references may refer either to the number, or \
to a short name of the target environment, or to the contents \
of the environment. Philex builds on the facilities of the \
linguex package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn36396"

RPM_NAME = "texlive-philex-2026.226.1.3svn36396-58.2.noarch.rpm"
RPM_HASH = "c4d7669ecd78dfbf98589ce17a098d98053b6ed56ea2c154621a8694d6d1cad79b9b0a4dc56d825163904db330b421011c22ef3fe4d7c8c714e377edb61b9b63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-philex.sty \
texlive-philex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-cgloss4e.sty \
tex-ifthen.sty \
tex-linguex.sty \
tex-suffix.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
