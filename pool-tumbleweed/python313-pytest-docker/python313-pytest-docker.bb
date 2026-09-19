SUMMARY = "Simple pytest fixtures for Docker and Docker Compose based tests"
DESCRIPTION = "Simple pytest fixtures that help you write integration tests with \
Docker and Docker Compose. Specify all necessary containers in a \
docker-compose.yml file and and pytest-docker will spin them up \
for the duration of your tests."
LICENSE = "MIT"

PV = "3.2.5"

RPM_NAME = "python313-pytest-docker-3.2.5-1.4.noarch.rpm"
RPM_HASH = "5402e21943642aaa50fae4b223a8d090918da7a480d4e9ed6dbefec905de1af24534f2403de3b0199eee3e202b55150e472738af87d4f792e72ebc05c6d1a31a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-docker \
python3.13dist-pytest-docker \
python313-pytest-docker \
python3dist-pytest-docker"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-pytest"

inherit rpm
