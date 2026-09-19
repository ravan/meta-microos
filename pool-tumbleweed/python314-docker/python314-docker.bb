SUMMARY = "A Python library for the Docker Engine API"
DESCRIPTION = "A Python library for the Docker Engine API."
LICENSE = "Apache-2.0"

PV = "7.2.0"

RPM_NAME = "python314-docker-7.2.0-1.1.noarch.rpm"
RPM_HASH = "f96ad83cd57d38f6420e2076b28b9796c9d957977cfb9388a0fc4cbc97aac32f28f3d757e098d5497e60d4ca1a790b1553662d540077e62bade25fa1c1825ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-docker \
python314-docker \
python3dist-docker"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-requests \
python314-urllib3 \
python314-websocket-client"

inherit rpm
