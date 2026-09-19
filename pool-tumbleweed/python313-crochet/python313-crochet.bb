SUMMARY = "Use Twisted from any applications"
DESCRIPTION = "Crochet is an MIT-licensed library that makes it easier for blocking or \
threaded applications like Flask or Django to use the Twisted networking \
framework."
LICENSE = "MIT"

PV = "2.1.1"

RPM_NAME = "python313-crochet-2.1.1-2.10.noarch.rpm"
RPM_HASH = "255f5a59d3ccf4e8925f870e36dc4b0ba5ebd1ef34a50a919decae7186b4469290355329bf6901e2111dc6ca696399668400091d08dcf75ca36350e6398ad3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-crochet \
python3.13dist-crochet \
python313-crochet \
python3dist-crochet"

RDEPENDS:${PN} += "python-abi \
python313-Twisted \
python313-wrapt"

inherit rpm
