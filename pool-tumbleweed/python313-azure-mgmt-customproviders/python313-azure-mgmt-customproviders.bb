SUMMARY = "Microsoft Azure CustomProviders Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure CustomProviders Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python313-azure-mgmt-customproviders-1.0.1-1.2.noarch.rpm"
RPM_HASH = "753898a363757f8c730dee27c80962d4611e64b1297465f8acbe1c79b164a86f423286461948192dd9977b409ce0186741bd006b828e4eb60ea4fec35e037e8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-customproviders \
python3.13dist-azure-mgmt-customproviders \
python313-azure-mgmt-customproviders \
python3dist-azure-mgmt-customproviders"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
