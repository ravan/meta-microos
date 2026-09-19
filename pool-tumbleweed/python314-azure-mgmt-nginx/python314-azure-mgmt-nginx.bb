SUMMARY = "Microsoft Azure Nginx Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Nginx Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "4.0.0"

RPM_NAME = "python314-azure-mgmt-nginx-4.0.0-1.3.noarch.rpm"
RPM_HASH = "667e1a6f6c8bdadbb5b14f69a4e4abc9f0ca341db5cccf99f195db40b1a52a9a6bac76c334ba0cbba314a7810c7f2e7b831ea53774973faf9f7a0846f1ff5a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-nginx \
python314-azure-mgmt-nginx \
python3dist-azure-mgmt-nginx"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-mgmt-core >= 1.6.0 with python314-azure-mgmt-core < 2.0.0 \
-python314-isodate >= 0.6.1 with python314-isodate < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
