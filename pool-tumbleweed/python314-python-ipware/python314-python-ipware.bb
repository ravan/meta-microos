SUMMARY = "A Python package to retrieve user's IP address"
DESCRIPTION = "A Python package to retrieve user's IP address"
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "python314-python-ipware-3.0.0-1.2.noarch.rpm"
RPM_HASH = "5db8418b516bd68f2858fbc0a2698a4d0023e61f05c6e9ae61e577ec2a235e0038cff5716947ea3ee2df3c4697d93dd27dbe5cdc7545d9bf6da36d6e685edc1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-ipware \
python314-python-ipware \
python3dist-python-ipware"

RDEPENDS:${PN} += "python-abi"

inherit rpm
