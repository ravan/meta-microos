SUMMARY = "Microsoft Azure Mysqlflexibleservers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mysqlflexibleservers Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python314-azure-mgmt-mysqlflexibleservers-1.1.0~b3-1.1.noarch.rpm"
RPM_HASH = "2b4f83233edde518a71eedc421100fb0be18b0db3957066550172acc21d60858860f39f4ee1c4f89c5eb18f393771f5aeecb0853b85b0cc03f1811fead63305d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-mysqlflexibleservers \
python314-azure-mgmt-mysqlflexibleservers \
python3dist-azure-mgmt-mysqlflexibleservers"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
