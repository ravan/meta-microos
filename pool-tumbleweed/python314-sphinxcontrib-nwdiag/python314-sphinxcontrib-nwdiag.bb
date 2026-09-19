SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-nwdiag-2.0.0-2.5.noarch.rpm"
RPM_HASH = "51dd8059f293e34e33342a3a289b42b19caca7bfb587ead55c6b12c4f6dfd23f54fa89ee08dd20c85986fd954c836547fe8982cc51596ac3099cc2230f37669b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-nwdiag \
python314-sphinxcontrib-nwdiag \
python3dist-sphinxcontrib-nwdiag"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-blockdiag \
python314-nwdiag"

inherit rpm
