SUMMARY = "Sphinx 'seqdiag' extension"
DESCRIPTION = "A sphinx extension for embedding sequence diagram using seqdiag_. \
 \
This extension enables you to insert sequence diagrams into your document."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python314-sphinxcontrib-seqdiag-3.0.0-2.5.noarch.rpm"
RPM_HASH = "12f18745ee3d8c0baf7cfbfd70ebf0f083fa576786ec8592c7235ddc3848cd166d1d950a17e8dfbe696003c55eb22dd7f214d24b18fa2f9f72f4e750e836f587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-seqdiag \
python314-sphinxcontrib-seqdiag \
python3dist-sphinxcontrib-seqdiag"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx \
python314-blockdiag \
python314-seqdiag"

inherit rpm
