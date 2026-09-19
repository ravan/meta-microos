SUMMARY = "Microsoft Azure Selfhelp Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Selfhelp Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-mgmt-selfhelp-1.0.0-2.9.noarch.rpm"
RPM_HASH = "cbf250edbdad7dc7572551b4616b5835303ff3e299340f4501c837bb90f4bff09f78497d0fea7374072f3c5d3d89e92368cb3bc22fe2e91f5957e163000c40e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-selfhelp \
python314-azure-mgmt-selfhelp \
python3dist-azure-mgmt-selfhelp"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.3.2 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg"

inherit rpm
