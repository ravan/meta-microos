SUMMARY = "Client library for openQA with async support"
DESCRIPTION = "A client for the openQA API based on httpx, providing both synchronous \
and asynchronous interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python313-openqa-async-1.0.0-1.1.noarch.rpm"
RPM_HASH = "9d8e256eb843eb6680550676f038cbd6409544b864d3c188a2ad4d8328c0315a1d5379724cd48ec45bb56bae2330da5d20a9a711406f9e58d46e874ee40ee2eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-openqa-async \
python3.13dist-openqa-async \
python313-openqa-async \
python3dist-openqa-async"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-httpx"

inherit rpm
