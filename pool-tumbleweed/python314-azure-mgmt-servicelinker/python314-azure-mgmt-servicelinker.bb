SUMMARY = "Microsoft Azure Servicelinker Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicelinker Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.2.0~b3"

RPM_NAME = "python314-azure-mgmt-servicelinker-1.2.0~b3-1.9.noarch.rpm"
RPM_HASH = "029f0c473d156c3a4d8b58fe22e3ec771fa10f0bd9800c0b6eb84d13806f785ab0b9b7b29fcf17643b1101d85143e2a2aaf93d3634f0e1b4beba390a3844ea37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-servicelinker \
python314-azure-mgmt-servicelinker \
python3dist-azure-mgmt-servicelinker"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
