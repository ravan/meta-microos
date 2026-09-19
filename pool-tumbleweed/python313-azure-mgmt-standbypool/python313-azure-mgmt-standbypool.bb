SUMMARY = "Microsoft Azure Standbypool Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Standbypool Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "python313-azure-mgmt-standbypool-2.1.0-1.2.noarch.rpm"
RPM_HASH = "ad23ebdc20de428b61017a20e9d958a4f8cdf326191a86482ddeef0c3a5204bca1f1071256214b738dea5c327c2112fbaf9c061969a76fb2e3864c6638b0b0ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-standbypool \
python3.13dist-azure-mgmt-standbypool \
python313-azure-mgmt-standbypool \
python3dist-azure-mgmt-standbypool"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
