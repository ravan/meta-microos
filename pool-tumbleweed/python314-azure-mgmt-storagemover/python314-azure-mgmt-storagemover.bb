SUMMARY = "Microsoft Azure Storagemover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Storagemover Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-azure-mgmt-storagemover-3.1.0-1.2.noarch.rpm"
RPM_HASH = "4f5e47de2af3660e5fa24fd87bcfb4859a8db687fd5b49819e59f6f90e2c46fe2e1706b99877e84b6767f56e4bb8b71fac15bb03e33d728095b67aab5221b703"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-storagemover \
python314-azure-mgmt-storagemover \
python3dist-azure-mgmt-storagemover"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
