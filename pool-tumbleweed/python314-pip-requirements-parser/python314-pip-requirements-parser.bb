SUMMARY = "Pip requirements parsing library"
DESCRIPTION = "A mostly correct pip requirements parsing library because it uses pip's own code."
LICENSE = "MIT"

PV = "32.0.1"

RPM_NAME = "python314-pip-requirements-parser-32.0.1-2.4.noarch.rpm"
RPM_HASH = "259c75c25c03c5cd0f1989322d556aa58f3e58e5d2fee28194cbddfa1e6155e4af087c8ee8af96b330ddb90856d0cf8bef93ef99c8d789bd72b73cb7579c79c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pip-requirements-parser \
python314-pip-requirements-parser \
python3dist-pip-requirements-parser"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-pyparsing"

inherit rpm
