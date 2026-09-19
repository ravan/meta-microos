SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python314-jaraco.tidelift-1.5.1-3.5.noarch.rpm"
RPM_HASH = "03b35e3996279ab332c51904aa18e8989b9fe8b31bc1a4d18e8629790dc976127e3d2438e262b53836bdfbe930d3487887f5efec991177c2e4c13b20302caa82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.tidelift \
python314-jaraco.tidelift \
python3dist-jaraco.tidelift"

RDEPENDS:${PN} += "python-abi \
python314-autocommand \
python314-importlib-resources \
python314-keyring \
python314-requests-toolbelt"

inherit rpm
