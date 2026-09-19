SUMMARY = "Python package for the study of complex networks"
DESCRIPTION = "NetworkX (NX) is a Python package for the creation, manipulation, and study of the structure, dynamics, \
and functions of complex networks. \
 \
Features: \
 * Includes standard graph-theoretic and statistical physics functions \
 * Exchange of network algorithms between applications, disciplines, and platforms \
 * Includes many classic graphs and synthetic networks \
 * Nodes and edges can be 'anything' (e.g. time-series, text, images, XML records) \
 * Exploits existing code from high-quality legacy software in C, C++, Fortran, etc. \
 * Unit-tested"
LICENSE = "BSD-3-Clause"

PV = "3.6.1"

RPM_NAME = "python314-networkx-3.6.1-1.3.noarch.rpm"
RPM_HASH = "959f969bcaf6c3d7dd87013b6cec1c2944bdcebe04b709de967e7e41f232aeedd7d131bda79aef0f3aeb72b230522b4c04a806714a027bb954ea789de83e292f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-networkx \
python314-networkx \
python3dist-networkx"

RDEPENDS:${PN} += "python-abi \
python314-matplotlib \
python314-numpy \
python314-pandas \
python314-scipy"

inherit rpm
