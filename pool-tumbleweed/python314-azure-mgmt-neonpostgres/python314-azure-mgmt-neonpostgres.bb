SUMMARY = "Microsoft Azure Neonpostgres Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Neonpostgres Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python314-azure-mgmt-neonpostgres-1.0.1-1.3.noarch.rpm"
RPM_HASH = "375913af8d120007429da9daeb092506d6e7d2c7efd9f3279c41337f0c49ed7c6020807171567f118ce5fc82b1847223987670c7d14d2fccd21233ee58dd7bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-neonpostgres \
python314-azure-mgmt-neonpostgres \
python3dist-azure-mgmt-neonpostgres"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
