SUMMARY = "Microsoft Azure Elasticsan Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Elasticsan Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-azure-mgmt-elasticsan-2.0.0-1.4.noarch.rpm"
RPM_HASH = "9f2b75f3a7bd33722fa3496c2d623961deb156fb02433dd387dcd8f2d5c97f2d70f94dde2b9122e8a285c5e95ead9f9ca64688628d5b42409c50fc60e9a3981d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-elasticsan \
python314-azure-mgmt-elasticsan \
python3dist-azure-mgmt-elasticsan"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
