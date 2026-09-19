SUMMARY = "Send responses to httpx"
DESCRIPTION = "Send responses to httpx."
LICENSE = "MIT"

PV = "0.36.2"

RPM_NAME = "python313-pytest-httpx-0.36.2-1.2.noarch.rpm"
RPM_HASH = "4bcefc34596e683bae04b7d07b490c1d6465824a37e1dd0ece244943934809c57e50d4606014b9315d36cd52370d88bd8f88add95b26a95cfb31c5ffcdd49607"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-httpx \
python3.13dist-pytest-httpx \
python313-pytest-httpx \
python3dist-pytest-httpx"

RDEPENDS:${PN} += "-python313-httpx >= 0.28.0 with python313-httpx < 0.29 \
python-abi \
python313-pytest"

inherit rpm
