SUMMARY = "AST Writer for docutils"
DESCRIPTION = "Docutils-ast-writer is an AST writer of Docutils."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python313-docutils-ast-writer-0.1.2-4.10.noarch.rpm"
RPM_HASH = "c323ea0497fc6b1f3a9f8b2b401a0f696ce6e4315be76f066f8c1e8a04ab1f2a044c36e669fab9b650ab3f6e3b8c5293088eb84bce60e5bc58f203fbdbff5eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docutils-ast-writer \
python3.13dist-docutils-ast-writer \
python313-docutils-ast-writer \
python3dist-docutils-ast-writer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-docutils \
update-alternatives"

inherit rpm
