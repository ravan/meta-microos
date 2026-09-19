SUMMARY = "Microsoft Azure Resource Mover Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Resource Mover Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.1.0.0"

RPM_NAME = "python313-azure-mgmt-resourcemover-1.1.0.0-2.9.noarch.rpm"
RPM_HASH = "70efa44ae06d7bfd2fd585902c5b1f34da079a02ad1b2291ac352062211a218ec330a886ff57b8bb03665b6b788da4c002a272cbb98eb1b623da0088a182574e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-resourcemover \
python3.13dist-azure-mgmt-resourcemover \
python313-azure-mgmt-resourcemover \
python3dist-azure-mgmt-resourcemover"

RDEPENDS:${PN} += "-python313-azure-common >= 1.1 with python313-azure-common < 2.0.0 \
-python313-azure-mgmt-core >= 1.3.2 with python313-azure-mgmt-core < 2.0.0 \
-python313-isodate >= 0.6.1 with python313-isodate < 1.0.0 \
python-abi \
python313-azure-mgmt-nspkg \
python313-azure-nspkg"

inherit rpm
