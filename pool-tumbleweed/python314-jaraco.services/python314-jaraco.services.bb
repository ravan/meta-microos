SUMMARY = "Service orchestration and pytest plugins"
DESCRIPTION = "Service orchestration and pytest plugins"
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-jaraco.services-4.0.0-1.4.noarch.rpm"
RPM_HASH = "5c936c35179646ed5ef751fe22b57f41a104b5e8a0f4a26b485f0fc9c08907132509b49dd441643874eeaeb577eb29956cb36e7a2b547e4b3209cd66918ef8a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.services \
python314-jaraco.services \
python3dist-jaraco.services"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.classes \
python314-path \
python314-portend \
python314-tempora"

inherit rpm
