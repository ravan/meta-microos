SUMMARY = "Microsoft Azure Deviceregistry Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Deviceregistry Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-azure-mgmt-deviceregistry-1.1.0-1.4.noarch.rpm"
RPM_HASH = "267a30f4674d608f05b9234d05255227bce6be944daf999dc2019b4a1bb9679018598d23936b2a61e64d61bb4e9a99ec49f9eccf6a33348a58bc0bae0fb20f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-deviceregistry \
python3.13dist-azure-mgmt-deviceregistry \
python313-azure-mgmt-deviceregistry \
python3dist-azure-mgmt-deviceregistry"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
