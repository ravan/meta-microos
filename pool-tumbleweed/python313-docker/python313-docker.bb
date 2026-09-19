SUMMARY = "A Python library for the Docker Engine API"
DESCRIPTION = "A Python library for the Docker Engine API."
LICENSE = "Apache-2.0"

PV = "7.2.0"

RPM_NAME = "python313-docker-7.2.0-1.1.noarch.rpm"
RPM_HASH = "f19f4be7e50439fb9850ca6aa3e250075ce89dcc350d7334bd918d80769515360ba8bf944ec1b94a320b84a55e57c88a934f56b06353c6bdbacf00ed66c43d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docker \
python3.13dist-docker \
python313-docker \
python3dist-docker"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-requests \
python313-urllib3 \
python313-websocket-client"

inherit rpm
