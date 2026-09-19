SUMMARY = "Python Development Master"
DESCRIPTION = "PDM is a modern Python package manager with PEP 582 support. It \
installs and manages packages in a similar way to npm that \
doesn't need to create a virtualenv at all!"
LICENSE = "MIT"

PV = "2.28.0"

RPM_NAME = "python314-pdm-2.28.0-1.2.noarch.rpm"
RPM_HASH = "969a045046061ec13707c0a73fa5d3f27c25646b72af974b91878d4833b4353d96f569dac2bd410f53bec23039b5b1e8e4427f1c10354891bba96e39526c470c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pdm \
python314-pdm \
python3dist-pdm"

RDEPENDS:${PN} += "-python314-tomlkit >= 0.11.1 with python314-tomlkit < 1 \
/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-blinker \
python314-certifi \
python314-dep-logic \
python314-filelock \
python314-findpython \
python314-hishel \
python314-httpcore \
python314-httpx \
python314-id \
python314-installer \
python314-packaging \
python314-pbs-installer \
python314-platformdirs \
python314-pyproject-hooks \
python314-python-dotenv \
python314-resolvelib \
python314-rich \
python314-shellingham \
python314-truststore \
python314-unearth \
python314-virtualenv \
update-alternatives"

inherit rpm
