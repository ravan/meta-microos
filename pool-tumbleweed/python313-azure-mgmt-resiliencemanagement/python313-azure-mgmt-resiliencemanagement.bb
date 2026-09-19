SUMMARY = "Microsoft Azure Resiliencemanagement Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resiliencemanagement Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-resiliencemanagement-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "c423910a7297776af74f0a7dc9ebb541bb0d84738b57fe410f9b06fc73de120976df31632527b09c647f45aaedbf5b03445f42117046997ae2a760e778ae093b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resiliencemanagement \
python3.13dist-azure-mgmt-resiliencemanagement \
python313-azure-mgmt-resiliencemanagement \
python3dist-azure-mgmt-resiliencemanagement"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
