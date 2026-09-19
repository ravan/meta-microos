SUMMARY = "Sphinx 'nwdiag' extension"
DESCRIPTION = "sphinxcontrib-nwdiag is a Sphinx extension for embedding nwdiag \
diagrams. Network diagrams can be embedded with the 'nwdiag', \
'rackdiag' and 'packetdiag' directives."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-nwdiag-2.0.0-2.5.noarch.rpm"
RPM_HASH = "5cbe9e8ba03c7cd453c99f80c0d342831965c63904ab5aec0b187d011cf3b29d3293246ce0d0721ed5313b82c184c10de7eb1824ea58c44b0e6b3f830ff43a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-nwdiag \
python3.13dist-sphinxcontrib-nwdiag \
python313-sphinxcontrib-nwdiag \
python3dist-sphinxcontrib-nwdiag"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-blockdiag \
python313-nwdiag"

inherit rpm
