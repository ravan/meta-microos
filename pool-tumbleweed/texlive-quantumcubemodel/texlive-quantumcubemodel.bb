SUMMARY = "Representation of quantum states in the quantum cube model"
DESCRIPTION = "This package provides simple LaTeX commands to draw intuitive \
cube-based diagrams for quantum states of one, two, or three \
qubits. Inspired by Prof. B. Just's educational framework, it \
supports amplitude-phase notation, gate transition \
visualizations (Hadamard, Pauli, CNOT, Toffoli). The package is \
ideal for teaching and documenting small quantum circuits."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.0svn77308"

RPM_NAME = "texlive-quantumcubemodel-2026.226.0.0.2.0svn77308-60.4.noarch.rpm"
RPM_HASH = "318f2617e1f37f35750c26548bb1074e8ec31c2464d83d0534f051ed538887122b1da1fd9ea8eac81eb74563e7a8c7e5a6e8ee64d617ebd9cf0be567f83bf281"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quantumcubemodel.sty \
texlive-quantumcubemodel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-braket.sty \
tex-kvoptions.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
