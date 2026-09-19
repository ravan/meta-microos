SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.28.0"

RPM_NAME = "python313-pdm-2.28.0-1.2.noarch.rpm"
RPM_HASH = "e409592338e2bb2aec187ffbc33ac69bee0bc44bbb356320798ca4c9eda44bcb3ae40d7b51017c301b77f2c385f1c5de0c570250db7c98fc55750bac882a9b43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pdm \
python3.13dist-pdm \
python313-pdm \
python3dist-pdm"

RDEPENDS:${PN} += "-python313-tomlkit >= 0.11.1 with python313-tomlkit < 1 \
/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-blinker \
python313-certifi \
python313-dep-logic \
python313-filelock \
python313-findpython \
python313-hishel \
python313-httpcore \
python313-httpx \
python313-id \
python313-installer \
python313-packaging \
python313-pbs-installer \
python313-platformdirs \
python313-pyproject-hooks \
python313-python-dotenv \
python313-resolvelib \
python313-rich \
python313-shellingham \
python313-truststore \
python313-unearth \
python313-virtualenv \
update-alternatives"

inherit rpm
