SUMMARY = "Microsoft Azure Largeinstance Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Largeinstance Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-largeinstance-1.0.0~b1-1.9.noarch.rpm"
RPM_HASH = "aec1c3b573ea1f776e81b35f62ff3bd81d7c6b6b81374a73ebb9e34a99aeeee2379908ac2016004d75cfde90a71fbadc9f9c02809c242aed1262bb4b4acf3d98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-largeinstance \
python3.13dist-azure-mgmt-largeinstance \
python313-azure-mgmt-largeinstance \
python3dist-azure-mgmt-largeinstance"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
