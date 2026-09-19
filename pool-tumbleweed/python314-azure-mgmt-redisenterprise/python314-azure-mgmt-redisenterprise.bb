SUMMARY = "Microsoft Azure Redis Enterprise Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Redis Enterprise Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "python314-azure-mgmt-redisenterprise-3.1.0-1.4.noarch.rpm"
RPM_HASH = "4261682c22231c56e89bf2d25e29c1e11ff65f32761b93b9225b68855800491a1f2d4d0e1b03c52735b019504e53af92ea9a837844c82b9682514d45855164e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-mgmt-redisenterprise \
python314-azure-mgmt-redisenterprise \
python3dist-azure-mgmt-redisenterprise"

RDEPENDS:${PN} += "-python314-azure-common >= 1.1 with python314-azure-common < 2.0.0 \
-python314-azure-core >= 1.6.0 with python314-azure-core < 2.0.0 \
-python314-msrest >= 0.7.1 with python314-msrest < 1.0.0 \
python-abi \
python314-azure-mgmt-nspkg \
python314-azure-nspkg \
python314-typing-extensions"

inherit rpm
