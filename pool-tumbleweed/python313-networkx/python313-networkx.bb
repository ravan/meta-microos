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

RPM_NAME = "python313-networkx-3.6.1-1.3.noarch.rpm"
RPM_HASH = "89d867ffee7f5b8905af02c1f50ec8a5c154d1322e3d7f25e164b0d7ea1d68334540f26be3e84ca422eb95319bbf110c71ebfff91ee37bb5c08fe03bde340593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-networkx \
python3.13dist-networkx \
python313-networkx \
python3dist-networkx"

RDEPENDS:${PN} += "python-abi \
python313-matplotlib \
python313-numpy \
python313-pandas \
python313-scipy"

inherit rpm
