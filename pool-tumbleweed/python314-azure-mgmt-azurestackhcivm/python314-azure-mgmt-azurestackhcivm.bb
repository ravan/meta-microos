SUMMARY = "Microsoft Azure Azurestackhcivm Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Azurestackhcivm Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-azurestackhcivm-1.0.0~b1-1.4.noarch.rpm"
RPM_HASH = "051d326486f1f2b61aef9c031ea96158606c3429d3fff46d23026c6f5f9e8a26a501c85e21309b3ecb981fac34749697ac74efcfe353f908faaa421e3b8bcc74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-azurestackhcivm \
python314-azure-mgmt-azurestackhcivm \
python3dist-azure-mgmt-azurestackhcivm"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
