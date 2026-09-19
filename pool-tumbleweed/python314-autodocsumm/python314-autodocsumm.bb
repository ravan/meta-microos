SUMMARY = "Extended sphinx autodoc including automatic autosummaries"
DESCRIPTION = "Extended sphinx autodoc including automatic autosummaries"
LICENSE = "Apache-2.0"

PV = "0.2.15"

RPM_NAME = "python314-autodocsumm-0.2.15-1.3.noarch.rpm"
RPM_HASH = "e6a1e7ff087a4966ed1e809d0ff846db7bd33c3c78999ccf6588732dda3b6134866a89dadb17fc827e974e8cefaf0ede41f70c42983659f938208293dada9dac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-autodocsumm \
python314-autodocsumm \
python3dist-autodocsumm"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
