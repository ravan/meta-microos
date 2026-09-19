SUMMARY = "An Epic Games Launcher alternative"
DESCRIPTION = "Legendary is an open-source game launcher that can install and manage games from the Epic Games Store."
LICENSE = "GPL-3.0-only"

PV = "0.21.0"

RPM_NAME = "legendary-0.21.0-1.1.noarch.rpm"
RPM_HASH = "aa8bb06fb075204800089054ad5be8becdd2e48dc9dab8bd4f4359393e37dcc9308074b4cf19d7d3d8034fbeef2fdeaf3a43acd49f5c91cae413b9246bedd306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "legendary \
python3.13dist-legendary-gl \
python3dist-legendary-gl"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3 \
python3-filelock \
python3-pycryptodomex \
python3-requests"

inherit rpm
