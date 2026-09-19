SUMMARY = "Microsoft Azure Connectedcache Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Connectedcache Management Client Library. \
 \
This package has been tested with Python 3.8+"
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python313-azure-mgmt-connectedcache-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "c0c7de2c9477e7312c00993848919a604b644318b1d88ce7830d2935162709508b585c5a25ef55d2fd1e8aa0a701b32018b9572c7658918b0f55837f0f028249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-connectedcache \
python3.13dist-azure-mgmt-connectedcache \
python313-azure-mgmt-connectedcache \
python3dist-azure-mgmt-connectedcache"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
