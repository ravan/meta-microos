SUMMARY = "Microsoft Azure Relationships Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Relationships Management Client Library. \
 \
This package has been tested with Python 3.9+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python314-azure-mgmt-relationships-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "8fe224a86554ef7d869be24ee7811936fd6e85712202b44de553146fcbaacebd662e188bd026d397124931a047be75a80f636368feb40c1cccc60a43703d01a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-relationships \
python314-azure-mgmt-relationships \
python3dist-azure-mgmt-relationships"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
