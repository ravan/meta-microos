SUMMARY = "Microsoft Azure Mysqlflexibleservers Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Mysqlflexibleservers Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.1.0~b3"

RPM_NAME = "python313-azure-mgmt-mysqlflexibleservers-1.1.0~b3-1.1.noarch.rpm"
RPM_HASH = "7b898d1dda9035dc38421fc15a658a7e17fce9ef1aa4da86305d17b0c5688c3e71c270e205e430934f02916fd14f63940ddfa03c5187a68d4b6604f5bc91dfc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-mysqlflexibleservers \
python3.13dist-azure-mgmt-mysqlflexibleservers \
python313-azure-mgmt-mysqlflexibleservers \
python3dist-azure-mgmt-mysqlflexibleservers"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.6.0 with python313-azure-mgmt-core < 2.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg \
python313-typing-extensions"

inherit rpm
