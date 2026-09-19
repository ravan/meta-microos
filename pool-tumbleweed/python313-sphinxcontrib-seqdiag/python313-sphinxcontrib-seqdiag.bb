SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python313-sphinxcontrib-seqdiag-3.0.0-2.5.noarch.rpm"
RPM_HASH = "51b8b8fed520f65ef8d18d61232f268a06298c29fd7973db3d0e168c29ca3ea943c837d66151f44cb2c857348b945070f184e25e19a58eb8948dab67630979cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-seqdiag \
python3.13dist-sphinxcontrib-seqdiag \
python313-sphinxcontrib-seqdiag \
python3dist-sphinxcontrib-seqdiag"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-blockdiag \
python313-seqdiag"

inherit rpm
