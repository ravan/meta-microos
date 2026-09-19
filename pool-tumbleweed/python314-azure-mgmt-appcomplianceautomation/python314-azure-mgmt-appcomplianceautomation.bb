SUMMARY = "Microsoft Azure Appcomplianceautomation Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Appcomplianceautomation Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-appcomplianceautomation-1.0.0-1.9.noarch.rpm"
RPM_HASH = "e0b4813cf5a03fac246092dec7a8802deae94ecc461d94460db315e16a028eada4bf5da7740182b290ce13f1475da069f3463d0f247b6d06b631ad3adda4eeb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-appcomplianceautomation \
python314-azure-mgmt-appcomplianceautomation \
python3dist-azure-mgmt-appcomplianceautomation"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
