SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python313-jaraco.tidelift-1.5.1-3.5.noarch.rpm"
RPM_HASH = "58501ea6ea0048675ad4cf9ca4b68c20e3070b7949e7c4a9e3c955cc88f12f765e815f764ce318b51d7396c6cf93ce300b64d0dbbbf8baf910da2c9023e0c4d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.tidelift \
python3.13dist-jaraco.tidelift \
python313-jaraco.tidelift \
python3dist-jaraco.tidelift"

RDEPENDS:${PN} += "python-abi \
python313-autocommand \
python313-importlib-resources \
python313-keyring \
python313-requests-toolbelt"

inherit rpm
