SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python314-jaraco.envs-2.6.0-2.5.noarch.rpm"
RPM_HASH = "8980c74f33309df964c24c06b7e27379a42c2cbb1651d20dac4d8cccf3d60fb75741697f0d265df8b66f4966877c66a9788bd4e912a0c3c5f25239c9f985ceea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.envs \
python314-jaraco.envs \
python3dist-jaraco.envs"

RDEPENDS:${PN} += "python-abi \
python314-path \
python314-virtualenv"

inherit rpm
