SUMMARY = "Microsoft Azure Domainregistration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Domainregistration Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python313-azure-mgmt-domainregistration-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "ec1dbcf1d22d6253b712a388fba0110f40b7115423051e01bbe99d334be02bb2f4d39ae331e32d752393c20d01694308b7072d117b175c57776a090f739962c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-domainregistration \
python3.13dist-azure-mgmt-domainregistration \
python313-azure-mgmt-domainregistration \
python3dist-azure-mgmt-domainregistration"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
