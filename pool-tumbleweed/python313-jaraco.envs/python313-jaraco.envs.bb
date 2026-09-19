SUMMARY = "Classes for Python Virtual Environments"
DESCRIPTION = "Classes for orchestrating Python (virtual) environments."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python313-jaraco.envs-2.6.0-2.5.noarch.rpm"
RPM_HASH = "079ec6f11f4a79a79d86afba0ab3808b20e869104e9d4c6e68015b7f5fe5b7fa600a27bb4542a76147956d4de9c1181f852e439fdb702144fb17c27bdcf203a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.envs \
python3.13dist-jaraco.envs \
python313-jaraco.envs \
python3dist-jaraco.envs"

RDEPENDS:${PN} += "python-abi \
python313-path \
python313-virtualenv"

inherit rpm
