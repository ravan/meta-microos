SUMMARY = "Microsoft Azure Domainregistration Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Domainregistration Management Client Library. \
 \
This package has been tested with Python 3.10+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-domainregistration-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "c1847734673131cfa6b013fa1fc54696de567807f71358f137ea7ff4db8b1019f55dbb3290fafd172b6a27e52096fcf591d13f2c744d4e4f0289cdf380ebacef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-domainregistration \
python314-azure-mgmt-domainregistration \
python3dist-azure-mgmt-domainregistration"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
