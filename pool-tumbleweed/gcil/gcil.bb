SUMMARY = "Launch .gitlab-ci.yml jobs locally"
DESCRIPTION = "Launch .gitlab-ci.yml jobs locally, wrapped inside the specific images, \
with inplace project volume mounts and adaptive user selections."
LICENSE = "Apache-2.0"

PV = "13.1.0"

RPM_NAME = "gcil-13.1.0-1.1.aarch64.rpm"
RPM_HASH = "b5aeec71a463b8841ec07ddfcb7978f9cc62f1ac75de0d06c6e81a7efd8aaaa492fd19f2323616b96ba9676c7c027b66c6c27d3625129325b54e72537689e79c"

RPROVIDES:${PN} += "gcil \
python3.13dist-gitlabci-local \
python3dist-gitlabci-local"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-coloredlogs \
python3-docker \
python3-importlib-metadata \
python3-packaging \
python3-prompt-toolkit \
python3-python-dotenv \
python3-questionary \
python3-requests"

inherit rpm
