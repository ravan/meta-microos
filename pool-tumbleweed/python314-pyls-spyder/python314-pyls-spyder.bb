SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python314-pyls-spyder-0.4.0-2.5.noarch.rpm"
RPM_HASH = "2b897f7ea2d67fc5de5c29a54c84ee5b1df9bbc0fe72caa781b11860eb4430bdc4f7a19a48e53184165b31d5bb98bb469a6219ff15d91386cd9423879d6509d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyls-spyder \
python314-pyls-spyder \
python3dist-pyls-spyder"

RDEPENDS:${PN} += "python-abi \
python314-python-lsp-server"

inherit rpm
