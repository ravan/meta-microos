SUMMARY = "@public decorator for populating __all__"
DESCRIPTION = "public -- @public for populating __all__."
LICENSE = "Apache-2.0"

PV = "7.0.0"

RPM_NAME = "python314-atpublic-7.0.0-1.5.noarch.rpm"
RPM_HASH = "e8752b27dad2528520461a28ae4fb363115e71e350ca72bb9043b3a1c406d8ede9f1ab4ed4f57d54bb620ae6f548f23ff83d34f125b70bd2cebabe3b26eba246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-atpublic \
python314-atpublic \
python3dist-atpublic"

RDEPENDS:${PN} += "python-abi"

inherit rpm
