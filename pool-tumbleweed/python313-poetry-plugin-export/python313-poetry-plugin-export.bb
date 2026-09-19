SUMMARY = "Poetry plugin to export the dependencies to various formats"
DESCRIPTION = "Poetry plugin to export the dependencies to various formats"
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "python313-poetry-plugin-export-1.10.0-1.2.noarch.rpm"
RPM_HASH = "a0dbdab33abe286a9cefa16c65410b16a4ab0c4fb29f0bba249eb76dba239fedc784a5bbfd0d32e73cb0bff4f07a1278aa7ccebec6230871e292b34fa572a570"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry-plugin-export \
python3.13dist-poetry-plugin-export \
python313-poetry-plugin-export \
python3dist-poetry-plugin-export"

RDEPENDS:${PN} += "-python313-poetry >= 2.1.0 with python313-poetry < 3 \
-python313-poetry-core >= 2.1.0 with python313-poetry-core < 3 \
python-abi \
python313-tomlkit"

inherit rpm
