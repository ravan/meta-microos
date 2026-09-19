SUMMARY = "Simple pytest fixtures for Docker and Docker Compose based tests"
DESCRIPTION = "Simple pytest fixtures that help you write integration tests with \
Docker and Docker Compose. Specify all necessary containers in a \
docker-compose.yml file and and pytest-docker will spin them up \
for the duration of your tests."
LICENSE = "MIT"

PV = "3.2.5"

RPM_NAME = "python314-pytest-docker-3.2.5-1.4.noarch.rpm"
RPM_HASH = "bf0ad7186f345503add201fd07cf4353cd4c50c30d7375e4e375edc64deb05615701cb094a612dbf9bbc6f5342017bca97c27c6941212a39ee5ce097851d1585"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-docker \
python314-pytest-docker \
python3dist-pytest-docker"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-pytest"

inherit rpm
