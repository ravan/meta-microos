SUMMARY = "A Python package to retrieve user's IP address"
DESCRIPTION = "A Python package to retrieve user's IP address"
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python313-python-ipware-3.0.0-1.2.noarch.rpm"
RPM_HASH = "afb32b87d343e4d036694cf29491486ba6a49b91ce3be9e4b3cd94eb6c4ddc32e8dad3bb4395b547c063dcacca1160423b144bac22c030b1a8c5ee6ba16268a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-ipware \
python3.13dist-python-ipware \
python313-python-ipware \
python3dist-python-ipware"

RDEPENDS:${PN} += "python-abi"

inherit rpm
