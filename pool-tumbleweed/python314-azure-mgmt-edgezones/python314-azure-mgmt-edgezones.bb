SUMMARY = "Microsoft Azure Edgezones Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Edgezones Management Client Library. \
 \
This package has been tested with Python 3.8+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-edgezones-1.0.0-1.1.noarch.rpm"
RPM_HASH = "821ea5444d887fc30d57b4cc57f542a123ada1fc7bdb27cca0e8406a96ddde6c6ea54d8c75212d700217010ed71e72c0376f82a1c61823dc5ee390990c02c379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-edgezones \
python314-azure-mgmt-edgezones \
python3dist-azure-mgmt-edgezones"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
