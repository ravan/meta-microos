SUMMARY = "Python class for using nmap from Python"
DESCRIPTION = "This is a Python class for using nmap and accessing scan results from Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1"

RPM_NAME = "python313-python-nmap-0.7.1-1.9.noarch.rpm"
RPM_HASH = "210f83727d18412bc13f84e2d999b8c98048301d7e0a2a516af90419a5fb29d73727fbbacfc080e6c5fa1904d600c2bfd62d5d0f02813f0fe8a89f0b2bb94155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-nmap \
python3.13dist-python-nmap \
python313-python-nmap \
python3dist-python-nmap"

RDEPENDS:${PN} += "python-abi"

inherit rpm
