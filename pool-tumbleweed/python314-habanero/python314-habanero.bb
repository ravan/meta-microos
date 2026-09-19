SUMMARY = "Low Level Client for Crossref Search API"
DESCRIPTION = "Low Level Client for Crossref Search API"
LICENSE = "MIT"

PV = "2.4.0"

RPM_NAME = "python314-habanero-2.4.0-1.2.noarch.rpm"
RPM_HASH = "e15a2c80f650ab22e6500575be320125d61a766c0ca64efd9acf692c900a2f0ab637e1fbdd564041a1ca4086c69a4cebafccf506e3eac903facb52c5233b299a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-habanero \
python314-habanero \
python3dist-habanero"

RDEPENDS:${PN} += "python-abi \
python314-httpx \
python314-packaging \
python314-tqdm \
python314-urllib3"

inherit rpm
