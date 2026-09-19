SUMMARY = "Predefined and new math operators"
DESCRIPTION = "This package defines control sequences for roughly one hundred \
and fifty math operators, including special functions, \
probability distributions, pure mathematical constructions, and \
a variant of \\overline. The package also provides an interface \
for users to define new math operators similar to the amsopn \
package. New operators can be medium or bold weight, and they \
may be declared as \\mathord or \\mathop subformulas."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn76273"

RPM_NAME = "texlive-math-operator-2026.226.1.3asvn76273-59.2.noarch.rpm"
RPM_HASH = "d12169fe2dea2c9abc1155c403cb99895228de530bac6c0e33e6690d70a9507b517feafe5e9c406d8494ff2b7ea6813e23a9ea654fc494a4f605b9ad66b199a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-math-operator.sty \
texlive-math-operator"

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
