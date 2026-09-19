SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.15"

RPM_NAME = "python313-autodocsumm-0.2.15-1.3.noarch.rpm"
RPM_HASH = "286c1e7d2a26a3248fea44721e3b375da175126a8a406a02f75063d86f47ebb6eac55bd5a20b1b3ef7f8f976bf9ef5b192d156a3131c1a752f84bc382a2155b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-autodocsumm \
python3.13dist-autodocsumm \
python313-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
